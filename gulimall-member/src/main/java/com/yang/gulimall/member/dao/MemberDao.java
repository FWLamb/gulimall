package com.yang.gulimall.member.dao;

import com.yang.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author yangbinbin
 * @email 541947595@qq.com
 * @date 2022-06-18 22:37:24
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
