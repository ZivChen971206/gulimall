package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author chenzijian
 * @email czj15201272811@gmail.com
 * @date 2023-07-03 19:06:02
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
