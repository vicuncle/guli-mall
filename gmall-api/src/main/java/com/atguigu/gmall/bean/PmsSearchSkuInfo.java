package com.atguigu.gmall.bean;



import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * elasticsearch数据结构
 * @author ly
 * @date 2020/02/03
 */

public class PmsSearchSkuInfo implements Serializable {

    private static final long serialVersionUID = 5191678064854679546L;
    @Id
    private Long id;
    private String skuName;
    private String skuDesc;
    private Long catalog3Id;
    private Object price;
    private String skuDefaultImg;
    private Double hotScore;
    private Long productId;
    @Transient
    private List<PmsSkuAttrValue> skuAttrValueList;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public String getSkuDesc() {
        return skuDesc;
    }

    public void setSkuDesc(String skuDesc) {
        this.skuDesc = skuDesc;
    }

    public Long getCatalog3Id() {
        return catalog3Id;
    }

    public void setCatalog3Id(Long catalog3Id) {
        this.catalog3Id = catalog3Id;
    }

    public Object getPrice() {
        return price;
    }

    public void setPrice(Object price) {
        this.price = price;
    }

    public String getSkuDefaultImg() {
        return skuDefaultImg;
    }

    public void setSkuDefaultImg(String skuDefaultImg) {
        this.skuDefaultImg = skuDefaultImg;
    }

    public Double getHotScore() {
        return hotScore;
    }

    public void setHotScore(Double hotScore) {
        this.hotScore = hotScore;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public List<PmsSkuAttrValue> getSkuAttrValueList() {
        return skuAttrValueList;
    }

    public void setSkuAttrValueList(List<PmsSkuAttrValue> skuAttrValueList) {
        this.skuAttrValueList = skuAttrValueList;
    }
}
