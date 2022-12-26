package com.cuckooM.recharge.order.entity;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 电信运营商
 */
public enum OperatorTel {

    /** 中国移动 */
    MOBILE(0),

    /** 中国联通 */
    UNICOM(1),

    /** 中国电信 */
    TELECOM(2);

    /** 值 */
    private int value;

    /**
     * 构造函数
     * @param value 值
     */
    OperatorTel(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}
