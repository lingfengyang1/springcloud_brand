package com.example.admin.feign;

import com.example.admin.entity.Brand;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// 指定要调用的服务名称
@FeignClient(name = "brand-service")
public interface BrandServiceClient {

    /**
     * 查询所有品牌
     */
    @GetMapping("/brands")
    List<Brand> findAll();

    /**
     * 根据ID查询品牌
     */
    @GetMapping("/brands/{id}")
    Brand findById(@PathVariable("id") Long id);

    /**
     * 新增品牌
     */
    @PostMapping("/brands")
    int save(@RequestBody Brand brand);

    /**
     * 更新品牌
     */
    @PutMapping("/brands")
    int update(@RequestBody Brand brand);

    /**
     * 删除品牌
     */
    @DeleteMapping("/brands/{id}")
    int deleteById(@PathVariable("id") Long id);
}
    