package com.yang.gulimall.order.dao;

import com.yang.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author yangbinbin
 * @email 541947595@qq.com
 * @date 2022-06-18 22:30:01
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
