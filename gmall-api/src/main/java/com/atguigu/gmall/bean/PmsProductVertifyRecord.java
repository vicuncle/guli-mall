package com.atguigu.gmall.bean;



import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * 商品审核记录(PmsProductVertifyRecord)表实体类
 *
 * @author ly
 * @date 2020/01/28
 */

public class PmsProductVertifyRecord implements Serializable{

    private static final long serialVersionUID = -53159862062271674L;

    @Id
    private Long id;
    
    private Long productId;
    
    private Date createTime;
    /**
     * 审核人
     */
    private String vertifyMan;
    
    private Integer status;
    /**
     * 反馈详情
     */
    private String detail;

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getVertifyMan() {
        return vertifyMan;
    }

    public void setVertifyMan(String vertifyMan) {
        this.vertifyMan = vertifyMan;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}