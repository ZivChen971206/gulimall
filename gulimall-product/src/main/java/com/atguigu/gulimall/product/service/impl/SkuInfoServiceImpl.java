package com.atguigu.gulimall.product.service.impl;

import com.atguigu.common.to.es.SkuEsModel;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.product.dao.SkuInfoDao;
import com.atguigu.gulimall.product.entity.SkuInfoEntity;
import com.atguigu.gulimall.product.service.SkuInfoService;
import org.springframework.util.StringUtils;


@Service("skuInfoService")
public class SkuInfoServiceImpl extends ServiceImpl<SkuInfoDao, SkuInfoEntity> implements SkuInfoService {
    @Autowired
    private SkuInfoService skuInfoService;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SkuInfoEntity> page = this.page(
                new Query<SkuInfoEntity>().getPage(params),
                new QueryWrapper<SkuInfoEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public void saveSkuInfo(SkuInfoEntity skuInfoEntity) {
        baseMapper.insert(skuInfoEntity);
    }

    @Override
    public PageUtils queryPageByCondition(Map<String, Object> params) {
        LambdaQueryWrapper<SkuInfoEntity> queryWrapper = new LambdaQueryWrapper<>();

        String key = (String) params.get("key");
        if (StringUtils.isEmpty(key)) {
            queryWrapper.and(wrapper -> {
                wrapper.eq(SkuInfoEntity::getSkuId, key).or().like(SkuInfoEntity::getSkuName, key);
            });

        }
        String catelogId = (String) params.get("catelogId");
        if (StringUtils.isEmpty(key) && !"0".equalsIgnoreCase(catelogId)) {
            queryWrapper.eq(SkuInfoEntity::getCatalogId, catelogId);
        }
        String brandId = (String) params.get("brandId");
        if (StringUtils.isEmpty(key) && !"0".equalsIgnoreCase(brandId)) {
            queryWrapper.eq(SkuInfoEntity::getBrandId, brandId);
        }
        String min = (String) params.get("min");
        if (!StringUtils.isEmpty(min)) {
            queryWrapper.ge(SkuInfoEntity::getPrice, min);
        }

        String max = (String) params.get("max");
        if (StringUtils.isEmpty(key)) {
            queryWrapper.le(SkuInfoEntity::getPrice, max);
        }

        if (StringUtils.isEmpty(key)) {
            try {
                BigDecimal bigDecimal = new BigDecimal(min);
                if (bigDecimal.compareTo(new BigDecimal("0")) > 0) {
                    queryWrapper.ge(SkuInfoEntity::getPrice, min);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        IPage<SkuInfoEntity> page = this.page(
                new Query<SkuInfoEntity>().getPage(params),
                queryWrapper
        );
        return new PageUtils(page);
    }

    @Override
    public List<SkuInfoEntity> getSkusBySpuId(Long spuId) {
        LambdaQueryWrapper<SkuInfoEntity> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(SkuInfoEntity::getSpuId,spuId);
        return this.list(queryWrapper);
    }

}