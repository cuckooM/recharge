package com.cuckooM.recharge.order.repository;

import com.cuckooM.recharge.order.entity.OrderPhone;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * 话费订单数据访问层接口
 */
public interface OrderPhoneRepository extends PagingAndSortingRepository<OrderPhone, Long>,
    JpaSpecificationExecutor<OrderPhone> {
}
