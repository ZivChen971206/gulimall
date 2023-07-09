package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author chenzijian
 * @email czj15201272811@gmail.com
 * @date 2023-07-03 19:09:59
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
