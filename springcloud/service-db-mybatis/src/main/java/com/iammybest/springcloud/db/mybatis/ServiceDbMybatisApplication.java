package com.iammybest.springcloud.db.mybatis;

import com.iammybest.springcloud.db.mybatis.filter.LogFilter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
@MapperScan("com.iammybest.springcloud.db.mybatis.dao")
/**
 * @Author 邓清海
 * @Date 2017/11/9 11:01
 * Description: 用于整理 springboot与mybatis和事务整合
 */
@EnableTransactionManagement
@ServletComponentScan
public class ServiceDbMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDbMybatisApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean getDemoFilter(){
		LogFilter demoFilter=new LogFilter();
		FilterRegistrationBean registrationBean=new FilterRegistrationBean();
		registrationBean.setFilter(demoFilter);
		List<String> urlPatterns=new ArrayList<String>();
		urlPatterns.add("/*");//拦截路径，可以添加多个
		registrationBean.setUrlPatterns(urlPatterns);
		registrationBean.setOrder(1);
		return registrationBean;
	}
}
