package com.yang.gulimall.order.dao;

import com.yang.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author yangbinbin
 * @email 541947595@qq.com
 * @date 2022-06-18 22:30:01
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
