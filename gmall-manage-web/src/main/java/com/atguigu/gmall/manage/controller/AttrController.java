package com.atguigu.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.PmsBaseAttrInfo;
import com.atguigu.gmall.bean.PmsBaseAttrValue;
import com.atguigu.gmall.service.AttrService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 平台属性控制器
 */
@RestController
@CrossOrigin//解决跨域
public class AttrController {

    @Reference
    private AttrService attrService;

    /**
     * 平台属性列表
     * @param catalog3Id 三级分类id
     * @return
     */
    @GetMapping("/attrInfoList")
    public List<PmsBaseAttrInfo> getAttrInfoList(String catalog3Id){
        List<PmsBaseAttrInfo> pmsBaseAttrInfos = attrService.getAttrInfoList(catalog3Id);
//        for (PmsBaseAttrInfo pmsBaseAttrInfo : pmsBaseAttrInfos) {
//            List<PmsBaseAttrValue> attrValues = attrService.getAttrValueList(pmsBaseAttrInfo.getId());
//            pmsBaseAttrInfo.setAttrValueList(attrValues);
//        }
        return pmsBaseAttrInfos;
    }

    /**
     * 增加平台属性
     * @param pmsBaseAttrInfo
     * @return
     */
    @PostMapping("/saveAttrInfo")
    public String saveAttrInfo(@RequestBody PmsBaseAttrInfo pmsBaseAttrInfo){
        String success = attrService.saveAttrInfo(pmsBaseAttrInfo);
        return success;
    }

    /**
     * 根据属性id获取所有属性值
     * @param attrId 属性id
     * @return
     */
    @PostMapping("/getAttrValueList")
    public List<PmsBaseAttrValue> getAttrValueList(String attrId){
        List<PmsBaseAttrValue> attrValueList = attrService.getAttrValueList(Long.parseLong(attrId));
        return attrValueList;
    }

}
