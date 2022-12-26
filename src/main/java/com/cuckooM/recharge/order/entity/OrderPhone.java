package com.cuckooM.recharge.order.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 话费订单实体
 */
@Entity
@Table(name = "tbl_order_phone")
public class OrderPhone implements Serializable {

    /** 序列化 ID */
    private static final long serialVersionUID = 641733058959652504L;

    /** 自增 ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** 用户 ID */
    @Column(name = "user_id")
    private String userId;

    /** 手机号 */
    @Column(name = "phone_number")
    private String phoneNumber;

    /** 运营商 */
    @Enumerated
    private OperatorTel operator;

    /** 金额 */
    @Column(name = "money")
    private Double money;

    /** 创建时间 */
    @Column(name = "create_time")
    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public OperatorTel getOperator() {
        return operator;
    }

    public void setOperator(OperatorTel operator) {
        this.operator = operator;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
