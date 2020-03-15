package com.atguigu.gmall.bean;


import javax.persistence.Id;
import java.io.Serializable;

/**
 * (PmsBaseSaleAttr)表实体类
 *
 * @author ly
 * @date 2020/01/28
 */

public class PmsBaseSaleAttr implements Serializable{

    private static final long serialVersionUID = 357061095387812693L;
    /**
     * 编号
     */
    @Id
    private Long id;
    /**
     * 销售属性名称
     */
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}