package com.cc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.cc.crm.settings.dao", "com.cc.crm.workbench.dao"})

public class SsmSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsmSpringBootApplication.class, args);
    }

}
