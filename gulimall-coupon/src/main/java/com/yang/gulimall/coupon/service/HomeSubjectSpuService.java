package com.yang.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yang.common.utils.PageUtils;
import com.yang.gulimall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author yangbinbin
 * @email 541947595@qq.com
 * @date 2022-06-18 22:25:54
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

