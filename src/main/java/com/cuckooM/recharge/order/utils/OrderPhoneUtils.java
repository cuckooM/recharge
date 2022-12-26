package com.cuckooM.recharge.order.utils;

import com.cuckooM.recharge.order.dto.OrderPhoneDTO;
import com.cuckooM.recharge.order.entity.OrderPhone;
import org.springframework.beans.BeanUtils;
import org.springframework.lang.NonNull;

import java.util.Date;

/**
 * 工具类
 */
public class OrderPhoneUtils {

    /** 防止实例化 */
    private OrderPhoneUtils() {
    }

    /**
     * 实体转化
     * @param dto DTO 实体
     * @return 实体
     */
    @NonNull
    public static OrderPhone convert(@NonNull OrderPhoneDTO dto) {
        OrderPhone entity = new OrderPhone();
        BeanUtils.copyProperties(dto, entity, "id", "createTime");
        entity.setCreateTime(new Date());
        return entity;
    }

    /**
     * 实体转化
     * @param entity 实体
     * @return DTO 实体
     */
    @NonNull
    public static OrderPhoneDTO convert(@NonNull OrderPhone entity) {
        OrderPhoneDTO dto = new OrderPhoneDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

}
