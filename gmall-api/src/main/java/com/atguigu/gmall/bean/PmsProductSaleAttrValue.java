package com.atguigu.gmall.bean;



import javax.persistence.Id;
import java.io.Serializable;

/**
 * spu销售属性值(PmsProductSaleAttrValue)表实体类
 *
 * @author ly
 * @date 2020/01/28
 */

public class PmsProductSaleAttrValue implements Serializable{

    private static final long serialVersionUID = -61084030453012486L;
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
     * 销售属性值名称
     */
    private String saleAttrValueName;


    private String isChecked;

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

    public String getSaleAttrValueName() {
        return saleAttrValueName;
    }

    public void setSaleAttrValueName(String saleAttrValueName) {
        this.saleAttrValueName = saleAttrValueName;
    }

    public String getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(String isChecked) {
        this.isChecked = isChecked;
    }
}