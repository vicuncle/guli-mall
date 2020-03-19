package com.atguigu.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.bean.PmsProductImage;
import com.atguigu.gmall.bean.PmsProductInfo;
import com.atguigu.gmall.bean.PmsProductSaleAttr;
import com.atguigu.gmall.bean.PmsProductSaleAttrValue;
import com.atguigu.gmall.manage.mapper.PmsProductImageMapper;
import com.atguigu.gmall.manage.mapper.PmsProductInfoMapper;
import com.atguigu.gmall.manage.mapper.PmsProductSaleAttrMapper;
import com.atguigu.gmall.manage.mapper.PmsProductSaleAttrValueMapper;
import com.atguigu.gmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private PmsProductInfoMapper pmsProductInfoMapper;
    @Autowired
    private PmsProductImageMapper pmsProductImageMapper;
    @Autowired
    private PmsProductSaleAttrMapper pmsProductSaleAttrMapper;
    @Autowired
    private PmsProductSaleAttrValueMapper pmsProductSaleAttrValueMapper;

    /**
     * 根据三级分类id查询spu列表
     * @param catalog3Id
     * @return
     */
    @Override
    public List<PmsProductInfo> spuList(String catalog3Id) {
        PmsProductInfo pmsProductInfo = new PmsProductInfo();
        pmsProductInfo.setCatalog3Id(Long.parseLong(catalog3Id));
        List<PmsProductInfo> pmsProductInfos = pmsProductInfoMapper.select(pmsProductInfo);
        return pmsProductInfos;
    }

    /**
     * 保存spu信息
     * @param pmsProductInfo
     * @return
     */
    @Override
    public String saveSpuInfo(PmsProductInfo pmsProductInfo) {
        int insert = pmsProductInfoMapper.insert(pmsProductInfo);
        Long productId = pmsProductInfo.getId();
        if(insert>=1){
            List<PmsProductSaleAttr> spuSaleAttrList = pmsProductInfo.getSpuSaleAttrList();
            for (PmsProductSaleAttr pmsProductSaleAttr : spuSaleAttrList) {
                pmsProductSaleAttr.setProductId(productId);
                int i = pmsProductSaleAttrMapper.insertSelective(pmsProductSaleAttr);
                if(i>=1){
                    List<PmsProductSaleAttrValue> spuSaleAttrValueList
                            = pmsProductSaleAttr.getSpuSaleAttrValueList();
                    for (PmsProductSaleAttrValue pmsProductSaleAttrValue : spuSaleAttrValueList) {
                        pmsProductSaleAttrValue.setProductId(productId);
                        pmsProductSaleAttrValueMapper.insertSelective(pmsProductSaleAttrValue);
                    }
                }
            }
            List<PmsProductImage> spuImageList = pmsProductInfo.getSpuImageList();
            for (PmsProductImage pmsProductImage : spuImageList) {
                pmsProductImage.setProductId(productId);
                pmsProductImageMapper.insertSelective(pmsProductImage);
            }

            return "success";
        }
        return "failed";

    }
}
