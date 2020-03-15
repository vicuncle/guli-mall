package com.atguigu.gmall.bean;



import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

/**
 * (PmsProductSaleAttr)表实体类
 *
 * @author ly
 * @date 2020/01/28
 */

public class PmsProductSaleAttr implements Serializable{

    private static final long serialVersionUID = -27255142083041436L;
    /**
     * id
     */
    @Id
    private Long id;
    /**
     * 商品id
     */
    private Long productId;
    /**
     * 销售属性id
     */
    private Long saleAttrId;
    /**
     * 销售属性名称(冗余)
     */
    private String saleAttrName;


    private List<PmsProductSaleAttrValue> spuSaleAttrValueList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getSaleAttrId() {
        return saleAttrId;
    }

    public void setSaleAttrId(Long saleAttrId) {
        this.saleAttrId = saleAttrId;
    }

    public String getSaleAttrName() {
        return saleAttrName;
    }

    public void setSaleAttrName(String saleAttrName) {
        this.saleAttrName = saleAttrName;
    }

    public List<PmsProductSaleAttrValue> getSpuSaleAttrValueList() {
        return spuSaleAttrValueList;
    }

    public void setSpuSaleAttrValueList(List<PmsProductSaleAttrValue> spuSaleAttrValueList) {
        this.spuSaleAttrValueList = spuSaleAttrValueList;
    }
}