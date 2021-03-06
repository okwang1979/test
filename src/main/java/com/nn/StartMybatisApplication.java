package com.nn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@MapperScan("com.nn.start_mybatis.dao.mapper")
@PropertySource(value={"classpath:/config.properties"},encoding = "UTF-8")
public class StartMybatisApplication {



    public static void main(String[] args) {
        SpringApplication.run(StartMybatisApplication.class, args);
    }
}
