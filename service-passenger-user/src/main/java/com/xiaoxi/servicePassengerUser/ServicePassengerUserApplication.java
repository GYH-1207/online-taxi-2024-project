package com.xiaoxi.servicePassengerUser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xiaoxi.servicePassengerUser.mapper")
public class ServicePassengerUserApplication {
    public static void main( String[] args ) {
        SpringApplication.run(ServicePassengerUserApplication.class);
    }
}
