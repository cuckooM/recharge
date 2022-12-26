package com.cuckooM.recharge.order.dto;

import com.cuckooM.recharge.order.entity.OperatorTel;
import com.cuckooM.recharge.order.entity.OrderPhone;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * {@link OrderPhone} DTO 实体
 */
public class OrderPhoneDTO implements Serializable {

    /** 序列化 ID */
    private static final long serialVersionUID = -7647825833979651112L;

    /** ID */
    private Long id;

    /** 用户 ID */
    private String userId;

    /** 手机号 */
    private String phoneNumber;

    /** 运营商 */
    private OperatorTel operator;

    /** 金额 */
    private Double money;

    /** 创建时间 */
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
