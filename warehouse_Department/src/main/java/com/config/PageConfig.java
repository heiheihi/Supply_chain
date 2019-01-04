package com.config;

import org.apache.ibatis.plugin.Interceptor;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.pagehelper.PageHelper;

@Configuration
public class PageConfig {

	@Bean
	public PageHelper pagehelper() {
		
		PageHelper pageHelper = new PageHelper();
		new SqlSessionFactoryBean().setPlugins(new Interceptor[] {pageHelper});
		return pageHelper;
	}
}
