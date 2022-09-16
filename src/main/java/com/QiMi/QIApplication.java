package com.QiMi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.QiMi.dao")
public class QIApplication {

    public static void main(String[] args) {
        SpringApplication.run(QIApplication.class, args);
    }

}
