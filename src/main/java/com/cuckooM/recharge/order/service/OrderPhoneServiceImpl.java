package com.cuckooM.recharge.order.service;

import com.cuckooM.recharge.order.dto.OrderPhoneDTO;
import com.cuckooM.recharge.order.entity.OrderPhone;
import com.cuckooM.recharge.order.repository.OrderPhoneRepository;
import com.cuckooM.recharge.order.utils.OrderPhoneUtils;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

/**
 * 话费订单业务逻辑层接口实现类
 */
@Service
public class OrderPhoneServiceImpl implements OrderPhoneService {

    /** 话费订单数据访问层接口 */
    private final OrderPhoneRepository orderPhoneRepository;

    /**
     * 构造函数
     * @param orderPhoneRepository 话费订单数据访问层接口
     */
    public OrderPhoneServiceImpl(@NonNull OrderPhoneRepository orderPhoneRepository) {
        this.orderPhoneRepository = orderPhoneRepository;
    }

    @Override
    @NonNull
    public OrderPhoneDTO add(@NonNull OrderPhoneDTO dto) {
        return OrderPhoneUtils.convert(orderPhoneRepository.save(OrderPhoneUtils.convert(dto)));
    }

    @Override
    @Nullable
    public OrderPhoneDTO findById(@NonNull Long id) {
        OrderPhone entity = orderPhoneRepository.findById(id).orElse(null);
        if (null != entity) {
            return OrderPhoneUtils.convert(entity);
        }
        return null;
    }
}
