package com.atguigu.gmall.bean;



import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.List;

/**
 * (PmsProductInfo)表实体类
 *
 * @author ly
 * @date 2020/01/28
 */

public class PmsProductInfo implements Serializable{

    private static final long serialVersionUID = -56431304808533254L;
    /**
     * 商品id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * 商品名称
     */
    private String productName;
    /**
     * 商品描述(后台简述）
     */
    private String description;
    /**
     * 三级分类id
     */
    private Long catalog3Id;
    /**
     * 品牌id
     */
    private Long tmId;

    @Transient
    private List<PmsProductImage> spuImageList;

    @Transient
    private List<PmsProductSaleAttr> spuSaleAttrList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCatalog3Id() {
        return catalog3Id;
    }

    public void setCatalog3Id(Long catalog3Id) {
        this.catalog3Id = catalog3Id;
    }

    public Long getTmId() {
        return tmId;
    }

    public void setTmId(Long tmId) {
        this.tmId = tmId;
    }

    public List<PmsProductImage> getSpuImageList() {
        return spuImageList;
    }

    public void setSpuImageList(List<PmsProductImage> spuImageList) {
        this.spuImageList = spuImageList;
    }

    public List<PmsProductSaleAttr> getSpuSaleAttrList() {
        return spuSaleAttrList;
    }

    public void setSpuSaleAttrList(List<PmsProductSaleAttr> spuSaleAttrList) {
        this.spuSaleAttrList = spuSaleAttrList;
    }
}