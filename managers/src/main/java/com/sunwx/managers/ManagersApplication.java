package com.sunwx.managers;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@MapperScan("com.sunwx.managers.mapper")
public class ManagersApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagersApplication.class, args);
	}

}
