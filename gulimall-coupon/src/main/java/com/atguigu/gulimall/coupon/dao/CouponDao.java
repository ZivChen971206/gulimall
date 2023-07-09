package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author chenzijian
 * @email czj15201272811@gmail.com
 * @date 2023-07-03 18:33:11
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
