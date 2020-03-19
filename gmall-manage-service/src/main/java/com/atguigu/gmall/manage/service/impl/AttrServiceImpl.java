package com.atguigu.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.bean.PmsBaseAttrInfo;
import com.atguigu.gmall.bean.PmsBaseAttrValue;
import com.atguigu.gmall.bean.PmsBaseSaleAttr;
import com.atguigu.gmall.manage.mapper.PmsBaseAttrInfoMapper;
import com.atguigu.gmall.manage.mapper.PmsBaseAttrValueMapper;
import com.atguigu.gmall.manage.mapper.PmsBaseSaleAttrMapper;
import com.atguigu.gmall.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * 平台属性实现类
 */
@Service
public class AttrServiceImpl implements AttrService {

    @Autowired
    private PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;

    @Autowired
    private PmsBaseAttrValueMapper pmsBaseAttrValueMapper;

    @Autowired
    private PmsBaseSaleAttrMapper pmsBaseSaleAttrMapper;

    /**
     * 根据三级分类id查询属性名称列表
     * @param catalog3Id 三级分类id
     * @return
     */
    @Override
    public List<PmsBaseAttrInfo> getAttrInfoList(String catalog3Id) {
        PmsBaseAttrInfo pmsBaseAttrInfo = new PmsBaseAttrInfo();
        pmsBaseAttrInfo.setCatalog3Id(Long.parseLong(catalog3Id));
        List<PmsBaseAttrInfo> pmsBaseAttrInfos = pmsBaseAttrInfoMapper.select(pmsBaseAttrInfo);
        return pmsBaseAttrInfos;
    }

    /**
     * 根据属性id获取属性值列表
     * @param attrInfoId 属性id
     * @return
     */
    @Override
    public List<PmsBaseAttrValue> getAttrValueList(Long attrInfoId) {
        PmsBaseAttrValue pmsBaseAttrValue = new PmsBaseAttrValue();
        pmsBaseAttrValue.setAttrId(attrInfoId);
        List<PmsBaseAttrValue> pmsBaseAttrValues = pmsBaseAttrValueMapper.select(pmsBaseAttrValue);
        return pmsBaseAttrValues;
    }

    /**
     * 新增或修改平台属性
     * @param pmsBaseAttrInfo
     * @return
     */
    @Override
    public String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo) {
        Long id = pmsBaseAttrInfo.getId();
        if(id == null){
            //id为空,新增属性
            List<PmsBaseAttrValue> attrValueList = pmsBaseAttrInfo.getAttrValueList();
            int i = pmsBaseAttrInfoMapper.insertSelective(pmsBaseAttrInfo);
            if(i>=1){
                for (PmsBaseAttrValue pmsBaseAttrValue : attrValueList) {
                    pmsBaseAttrValue.setAttrId(pmsBaseAttrInfo.getId());
                    pmsBaseAttrValueMapper.insertSelective(pmsBaseAttrValue);
                }
                return "success";
            }

            return "failed";
        }
        //id不为空修改属性
        //修改属性名
        Example example = new Example(PmsBaseAttrInfo.class);
        example.createCriteria().andEqualTo("id",id);
        //example:是过滤条件
        //pmsBaseAttrInfo:要修改的数据封装的对象
        int i = pmsBaseAttrInfoMapper.updateByExampleSelective(pmsBaseAttrInfo, example);
        if(i>=1){
            //属性修改成功,修改属性值
            //将原来的属性值删除
            PmsBaseAttrValue pmsBaseAttrValueDel = new PmsBaseAttrValue();
            pmsBaseAttrValueDel.setAttrId(id);
            pmsBaseAttrValueMapper.delete(pmsBaseAttrValueDel);
            //将新的属性值全部插入
            List<PmsBaseAttrValue> attrValueList = pmsBaseAttrInfo.getAttrValueList();
            for (PmsBaseAttrValue pmsBaseAttrValue : attrValueList) {
                //如果有新增的属性值,设置属性id
                pmsBaseAttrValue.setAttrId(id);
                pmsBaseAttrValueMapper.insertSelective(pmsBaseAttrValue);
            }
            return "success";
        }
        return "failed";
    }

    /**
     * 获取平台基本销售属性列表
     * @return
     */
    @Override
    public List<PmsBaseSaleAttr> baseSaleAttrList() {
        return pmsBaseSaleAttrMapper.selectAll();
    }
}
