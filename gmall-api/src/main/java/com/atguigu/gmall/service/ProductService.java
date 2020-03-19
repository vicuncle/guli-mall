package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.PmsProductInfo;

import java.util.List;

public interface ProductService {
    List<PmsProductInfo> spuList(String catalog3Id);

    String saveSpuInfo(PmsProductInfo pmsProductInfo);
}
