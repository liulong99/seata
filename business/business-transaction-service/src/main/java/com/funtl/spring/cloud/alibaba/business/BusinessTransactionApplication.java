package com.funtl.spring.cloud.alibaba.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description :
 * @Author 刘龙
 * @Date 2020/3/23 16:33
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class BusinessTransactionApplication {
    public static void main(String[] args) {
        SpringApplication.run(BusinessTransactionApplication.class,args);
    }
}
