package com.example.brand.mapper;

import com.example.brand.entity.Brand;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface BrandMapper {
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
    int insert(Brand brand);
    
    /**
     * 更新品牌
     */
    int update(Brand brand);
    
    /**
     * 删除品牌
     */
    int deleteById(Long id);
}
    