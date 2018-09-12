package com.nn.start_mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.nn.start_mybatis.dao")
public class StartMybatisApplication {



    public static void main(String[] args) {
        SpringApplication.run(StartMybatisApplication.class, args);
    }
}
