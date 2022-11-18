package com.open.space;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.open.space.mapper")
public class OpenSpaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenSpaceApplication.class, args);
    }

}
