package com.example.brand.service.impl;

import com.example.brand.entity.Brand;
import com.example.brand.mapper.BrandMapper;
import com.example.brand.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<Brand> findAll() {
        return brandMapper.findAll();
    }

    @Override
    public Brand findById(Long id) {
        return brandMapper.findById(id);
    }

    @Override
    public int save(Brand brand) {
        return brandMapper.insert(brand);
    }

    @Override
    public int update(Brand brand) {
        return brandMapper.update(brand);
    }

    @Override
    public int deleteById(Long id) {
        return brandMapper.deleteById(id);
    }
}
    