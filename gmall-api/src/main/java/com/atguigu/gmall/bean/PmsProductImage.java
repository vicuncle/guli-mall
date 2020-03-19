package com.atguigu.gmall.bean;



import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 商品图片表(PmsProductImage)表实体类
 *
 * @author ly
 * @date 2020/01/28
 */

public class PmsProductImage implements Serializable{

    private static final long serialVersionUID = 818408352686611194L;
    /**
     * 编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * 商品id
     */
    private Long productId;
    /**
     * 图片名称
     */
    private String imgName;
    /**
     * 图片路径
     */
    private String imgUrl;

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

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}