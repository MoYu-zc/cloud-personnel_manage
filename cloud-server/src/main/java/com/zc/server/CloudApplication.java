package com.zc.server;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Author MoYu
 * @Date 2021/4/10 2:04
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan("com.zc.server.mapper")
@EnableScheduling
public class CloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudApplication.class,args);
    }
}
