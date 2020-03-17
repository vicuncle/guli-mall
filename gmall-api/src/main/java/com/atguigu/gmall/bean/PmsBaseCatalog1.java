package com.atguigu.gmall.bean;


import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.List;

/**
 * 一级分类表(PmsBaseCatalog1)表实体类
 *
 * @author ly
 * @date 2020/01/27
 */

public class PmsBaseCatalog1 implements Serializable {

    private static final long serialVersionUID = 253058268125976446L;
    /**
     * 编号
     */
    @Id
    private Integer id;
    /**
     * 分类名称
     */
    private String name;

    @Transient
    private List<PmsBaseCatalog2> catalog2s;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PmsBaseCatalog2> getCatalog2s() {
        return catalog2s;
    }

    public void setCatalog2s(List<PmsBaseCatalog2> catalog2s) {
        this.catalog2s = catalog2s;
    }
}