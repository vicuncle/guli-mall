package com.atguigu.gmall.bean;



import java.io.Serializable;

/**
 * @author ly
 * @date 2020/02/03
 */

public class PmsSearchSkuInfoDTO implements Serializable {

    private static final long serialVersionUID = 5013277786699810834L;

    private Long catalog3Id;

    private String[] valueId;

    private String keyword;



    public Long getCatalog3Id() {
        return catalog3Id;
    }

    public void setCatalog3Id(Long catalog3Id) {
        this.catalog3Id = catalog3Id;
    }

    public String[] getValueId() {
        return valueId;
    }

    public void setValueId(String[] valueId) {
        this.valueId = valueId;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
