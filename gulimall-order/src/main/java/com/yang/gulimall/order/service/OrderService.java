package com.yang.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yang.common.utils.PageUtils;
import com.yang.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author yangbinbin
 * @email 541947595@qq.com
 * @date 2022-06-18 22:30:01
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

