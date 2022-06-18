package com.yang.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yang.common.utils.PageUtils;
import com.yang.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author yangbinbin
 * @email 541947595@qq.com
 * @date 2022-06-18 22:37:24
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

