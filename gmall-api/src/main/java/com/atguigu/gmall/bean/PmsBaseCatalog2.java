package com.atguigu.gmall.bean;


import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

/**
 * (PmsBaseCatalog2)表实体类
 *
 * @author ly
 * @date 2020/01/27
 */

public class PmsBaseCatalog2 implements Serializable {

    private static final long serialVersionUID = -29647383703156214L;
    /**
     * 编号
     */
    @Id
    private Integer id;
    /**
     * 二级分类名称
     */
    private String name;
    /**
     * 一级分类编号
     */
    private Integer catalog1Id;

    private List<PmsBaseCatalog3> catalog3List;

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

    public Integer getCatalog1Id() {
        return catalog1Id;
    }

    public void setCatalog1Id(Integer catalog1Id) {
        this.catalog1Id = catalog1Id;
    }

    public List<PmsBaseCatalog3> getCatalog3List() {
        return catalog3List;
    }

    public void setCatalog3List(List<PmsBaseCatalog3> catalog3List) {
        this.catalog3List = catalog3List;
    }
}