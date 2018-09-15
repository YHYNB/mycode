package com.example.springbootx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@ComponentScan("com.example.controller")
@MapperScan("com.example.dao")
public class SpringbootxApplication {





    public static void main(String[] args) {
        SpringApplication.run(SpringbootxApplication.class, args);
    }
}
