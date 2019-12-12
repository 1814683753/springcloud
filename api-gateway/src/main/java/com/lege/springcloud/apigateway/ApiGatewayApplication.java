package com.lege.springcloud.apigateway;

import com.lege.springcloud.apigateway.filter.MyFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @author hjl
 * 启动类
 */
@SpringBootApplication
@EnableZuulProxy
public class ApiGatewayApplication {

    @Bean
    public MyFilter myFilter() {
        return new MyFilter();
    }
    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }

}
