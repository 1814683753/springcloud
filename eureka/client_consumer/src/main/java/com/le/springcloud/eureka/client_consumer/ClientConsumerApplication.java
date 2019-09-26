package com.le.springcloud.eureka.client_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author  ：hjl
 * @date ：2019/9/26 14:49
 * @description： 启动类
 * @modified By：
 */
@SpringBootApplication
public class ClientConsumerApplication {
    /**
     * 初始化
     * @return
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(ClientConsumerApplication.class, args);
    }

}
