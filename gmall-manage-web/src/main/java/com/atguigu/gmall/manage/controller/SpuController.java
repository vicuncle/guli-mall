package com.atguigu.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.PmsProductInfo;
import com.atguigu.gmall.bean.PmsProductSaleAttr;
import com.atguigu.gmall.service.ProductService;
import com.atguigu.gmall.util.ProductUploadUtil;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * spu控制器
 */
@RestController
@CrossOrigin
public class SpuController {
    @Reference
    private ProductService productService;

    /**
     * 根据三级分类id查询spu列表
     * @param catalog3Id
     * @return
     */
    @GetMapping("/spuList")
    public List<PmsProductInfo> spuList(String catalog3Id){
        List<PmsProductInfo> pmsProductInfos = productService.spuList(catalog3Id);
        return pmsProductInfos;
    }

    /**
     * 保存spu信息
     * @param pmsProductInfo
     * @return
     */
    @PostMapping("/saveSpuInfo")
    public String saveSpuInfo(@RequestBody PmsProductInfo pmsProductInfo) {
        String result = productService.saveSpuInfo(pmsProductInfo);
        return result;

    }

    /**
     * 将图片上传到fdfs并返回url
     * @param file
     * @return
     */
    @PostMapping("/fileUpload")
    public String fileUpload(@RequestParam("file") MultipartFile file) {
        return ProductUploadUtil.uploadImage(file);
    }

}
