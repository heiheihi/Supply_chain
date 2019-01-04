package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

//@EnableDubbo
@SpringBootApplication
@MapperScan(value="mapper")
public class WarehouseDepartmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(WarehouseDepartmentApplication.class, args);
	}

}

