package com.example.admin.entity;

import lombok.Data;
import java.io.Serializable;
import java.util.Date;

@Data
public class Brand implements Serializable {
    private Long id;
    private String name;
    private String description;
    private Integer status; // 1:启用 0:禁用
    private Date createTime;
    private Date updateTime;
}
    