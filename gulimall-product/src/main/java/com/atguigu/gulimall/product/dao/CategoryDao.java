package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author chenzijian
 * @email czj15201272811@gmail.com
 * @date 2023-07-03 16:07:55
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
