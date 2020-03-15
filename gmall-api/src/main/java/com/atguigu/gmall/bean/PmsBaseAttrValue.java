package com.atguigu.gmall.bean;



import javax.persistence.Id;
import java.io.Serializable;

/**
 * 属性值表(PmsBaseAttrValue)表实体类
 *
 * @author ly
 * @date 2020/01/27
 */

public class PmsBaseAttrValue implements Serializable{

    private static final long serialVersionUID = 910220340301928065L;
    /**
     * 编号
     */
    @Id
    private Long id;
    /**
     * 属性值名称
     */
    private String valueName;
    /**
     * 属性id
     */
    private Long attrId;
    /**
     * 启用：1 停用：0 1
     */
    private String isEnabled;

    private String urlParam;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValueName() {
        return valueName;
    }

    public void setValueName(String valueName) {
        this.valueName = valueName;
    }

    public Long getAttrId() {
        return attrId;
    }

    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled;
    }

    public String getUrlParam() {
        return urlParam;
    }

    public void setUrlParam(String urlParam) {
        this.urlParam = urlParam;
    }
}