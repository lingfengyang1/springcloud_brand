package com.example.brand.controller;

import com.example.brand.entity.Brand;
import com.example.brand.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/brands")
public class BrandController {

    @Autowired
    private BrandService brandService;

    /**
     * 查询所有品牌
     */
    @GetMapping
    public List<Brand> findAll() {
        return brandService.findAll();
    }

    /**
     * 根据ID查询品牌
     */
    @GetMapping("/{id}")
    public Brand findById(@PathVariable Long id) {
        return brandService.findById(id);
    }

    /**
     * 新增品牌
     */
    @PostMapping
    public int save(@RequestBody Brand brand) {
        return brandService.save(brand);
    }

    /**
     * 更新品牌
     */
    @PutMapping
    public int update(@RequestBody Brand brand) {
        return brandService.update(brand);
    }

    /**
     * 删除品牌
     */
    @DeleteMapping("/{id}")
    public int deleteById(@PathVariable Long id) {
        return brandService.deleteById(id);
    }
}
    