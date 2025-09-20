package com.example.brand.service;

import com.example.brand.entity.Brand;
import java.util.List;

public interface BrandService {
    /**
     * 查询所有品牌
     */
    List<Brand> findAll();
    
    /**
     * 根据ID查询品牌
     */
    Brand findById(Long id);
    
    /**
     * 新增品牌
     */
    int save(Brand brand);
    
    /**
     * 更新品牌
     */
    int update(Brand brand);
    
    /**
     * 删除品牌
     */
    int deleteById(Long id);
}
    