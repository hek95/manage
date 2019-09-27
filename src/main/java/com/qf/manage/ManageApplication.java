package com.qf.manage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.qf") //开启扫描
@MapperScan("com.qf.dao")
public class ManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManageApplication.class, args);
    }

}
