package com.cuckooM.recharge.order.service;

import com.cuckooM.recharge.order.dto.OrderPhoneDTO;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

/**
 * 话费订单业务逻辑层接口
 */
public interface OrderPhoneService {

    /**
     * 增加
     * @param dto DTO 实体
     * @return 结果
     */
    @NonNull
    OrderPhoneDTO add(@NonNull OrderPhoneDTO dto);

    /**
     * 根据 ID 查询
     * @param id ID
     * @return 结果
     */
    @Nullable
    OrderPhoneDTO findById(@NonNull Long id);

}
