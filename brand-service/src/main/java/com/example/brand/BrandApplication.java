package com.example.brand;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // 启用服务发现
@MapperScan("com.example.brand.mapper") // MyBatis mapper扫描
public class BrandApplication {
    public static void main(String[] args) {
        SpringApplication.run(BrandApplication.class, args);
    }
}
    