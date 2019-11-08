package com.sunwx.dtsproductor;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class DtsProductorApplication {

    public static void main(String[] args) {
        SpringApplication.run(DtsProductorApplication.class, args);
    }

}
