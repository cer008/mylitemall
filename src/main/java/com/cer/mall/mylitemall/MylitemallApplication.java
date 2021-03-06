package com.cer.mall.mylitemall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@MapperScan("com.cer.mall.mylitemall.mbg.mapper")//扫描指定包下的mapper文件
@EnableConfigurationProperties//使@ConfigurationProperties注解生效
public class MylitemallApplication {
    public static void main(String[] args) {
        SpringApplication.run(MylitemallApplication.class, args);
    }
}
