package com.le.springcloud.eureka.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ：hjl
 * @date ：2019/9/26 14:49
 * @description： 启动类
 * @modified By：
 */
@SpringBootApplication
@EnableEurekaServer
public class ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }

}
