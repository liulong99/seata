package com.funtl.spring.cloud.alibaba.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Description :
 * @Author 刘龙
 * @Date 2020/3/23 15:33
 * @Version 1.0
 **/
@SpringBootApplication
@MapperScan(basePackages = "com.funtl.spring.cloud.alibaba.provider.mapper")
@EnableDiscoveryClient
@EnableTransactionManagement
public class ProviderOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderOrderApplication.class,args);
    }

}
