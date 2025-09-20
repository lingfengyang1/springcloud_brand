package com.example.admin.controller;

import com.example.admin.entity.Brand;
import com.example.admin.feign.BrandServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 处理品牌管理页面的控制器
 */
@Controller
@RequestMapping("/page")
public class BrandPageController {

    @Autowired
    private BrandServiceClient brandServiceClient;

    /**
     * 品牌列表页面
     */
    @GetMapping
    public String list(Model model) {
        List<Brand> brands = brandServiceClient.findAll();
        model.addAttribute("brands", brands);
        return "brand/list"; // 对应templates/brand/list.html
    }

    /**
     * 跳转到新增品牌页面
     */
    @GetMapping("/add")
    public String toAddPage(Model model) {
        model.addAttribute("brand", new Brand());
        return "brand/form"; // 对应templates/brand/form.html
    }

    /**
     * 跳转到编辑品牌页面
     */
    @GetMapping("/edit/{id}")
    public String toEditPage(@PathVariable Long id, Model model) {
        Brand brand = brandServiceClient.findById(id);
        model.addAttribute("brand", brand);
        return "brand/form"; // 对应templates/brand/form.html
    }

    /**
     * 保存品牌（新增或更新）
     */
    @PostMapping("/save")
    public String saveBrand(Brand brand) {
        if (brand.getId() == null) {
            // 新增品牌
            brandServiceClient.save(brand);
        } else {
            // 更新品牌
            brandServiceClient.update(brand);
        }
        return "redirect:/page"; // 保存后重定向到列表页
    }

    /**
     * 删除品牌
     */
    @GetMapping("/delete/{id}")
    public String deleteBrand(@PathVariable Long id) {
        brandServiceClient.deleteById(id);
        return "redirect:/page"; // 删除后重定向到列表页
    }
}
    