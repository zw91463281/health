package com.tyust.health;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.tyust.health.dao"})
public class HealthApplication {

    public static void main(String[] args) {
        SpringApplication.run(HealthApplication.class, args);
    }

}
