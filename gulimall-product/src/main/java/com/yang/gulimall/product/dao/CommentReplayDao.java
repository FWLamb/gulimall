package com.yang.gulimall.product.dao;

import com.yang.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author yangbinbin
 * @email 541947595@qq.com
 * @date 2022-06-17 22:01:06
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
