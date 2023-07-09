package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author chenzijian
 * @email czj15201272811@gmail.com
 * @date 2023-07-03 18:58:57
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
