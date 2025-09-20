CREATE DATABASE IF NOT EXISTS springcloud_db CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

USE springcloud_db;

CREATE TABLE IF NOT EXISTS t_brand (
  id BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  name VARCHAR(100) NOT NULL COMMENT '品牌名称',
  description VARCHAR(500) DEFAULT NULL COMMENT '品牌描述',
  status TINYINT DEFAULT 1 COMMENT '状态：1-启用，0-禁用',
  create_time DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  update_time DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='品牌表';

-- 初始化测试数据
INSERT INTO t_brand (name, description, status) VALUES
('华为', '华为技术有限公司', 1),
('小米', '小米科技有限责任公司', 1),
('苹果', '苹果公司', 1);
    