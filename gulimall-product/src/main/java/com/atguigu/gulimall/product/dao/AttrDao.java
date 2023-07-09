package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author chenzijian
 * @email czj15201272811@gmail.com
 * @date 2023-07-03 16:07:55
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
