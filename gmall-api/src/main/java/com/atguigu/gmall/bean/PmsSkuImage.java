package com.atguigu.gmall.bean;



import javax.persistence.Id;
import java.io.Serializable;

/**
 * 库存单元图片表(PmsSkuImage)表实体类
 *
 * @author ly
 * @date 2020/01/30
 */

public class PmsSkuImage implements Serializable{

    private static final long serialVersionUID = 523878288379110639L;
    /**
     * 编号
     */
    @Id
    private Long id;
    /**
     * 商品id
     */
    private Long skuId;
    /**
     * 图片名称（冗余）
     */
    private String imgName;
    /**
     * 图片路径(冗余)
     */
    private String imgUrl;
    /**
     * 商品图片id
     */
    private Long SpuImgId;
    /**
     * 是否默认
     */
    private String isDefault;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
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

    public Long getSpuImgId() {
        return SpuImgId;
    }

    public void setSpuImgId(Long spuImgId) {
        SpuImgId = spuImgId;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }
}