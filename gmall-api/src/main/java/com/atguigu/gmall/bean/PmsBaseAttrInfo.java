package com.atguigu.gmall.bean;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

/**
 * 属性表(PmsBaseAttrInfo)表实体类
 *
 * @author ly
 * @date 2020/01/27
 */

public class PmsBaseAttrInfo implements Serializable{

    private static final long serialVersionUID = -59552277887790299L;
    /**
     * 编号
     */
    @Id
    private Long id;
    /**
     * 属性名称
     */
    private String attrName;
    
    private Long catalog3Id;
    /**
     * 启用：1 停用：0
     */
    private String isEnabled;


    private List<PmsBaseAttrValue> attrValueList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public Long getCatalog3Id() {
        return catalog3Id;
    }

    public void setCatalog3Id(Long catalog3Id) {
        this.catalog3Id = catalog3Id;
    }

    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled;
    }

    public List<PmsBaseAttrValue> getAttrValueList() {
        return attrValueList;
    }

    public void setAttrValueList(List<PmsBaseAttrValue> attrValueList) {
        this.attrValueList = attrValueList;
    }
}