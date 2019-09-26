package com.le.springcloud.eureka.client_consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：hjl
 * @date ：2019/9/26 17:37
 * @description： 测试controller
 * @modified By：
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private LoadBalancerClient client;
    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping("/consumer")
    @ResponseBody
    public String consumer(){
        // 注意serviceId对应的是服务提供端配置文件中spring.application.name的值
        ServiceInstance instance = client.choose("client_test");
        String url = "http://" + instance.getHost() + ":" + instance.getPort() + "/test/hello";
        return restTemplate.getForObject(url, String.class);
    }
}
