package com.yang.gulimall.product.dao;

import com.yang.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author yangbinbin
 * @email 541947595@qq.com
 * @date 2022-06-17 22:01:07
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
