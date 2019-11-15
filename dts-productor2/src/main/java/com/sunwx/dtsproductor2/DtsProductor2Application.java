package com.sunwx.dtsproductor2;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class DtsProductor2Application {

    public static void main(String[] args) {
        SpringApplication.run(DtsProductor2Application.class, args);
    }

}
