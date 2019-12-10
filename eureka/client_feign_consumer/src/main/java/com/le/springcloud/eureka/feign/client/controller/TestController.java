package com.le.springcloud.eureka.feign.client.controller;

import com.le.springcloud.eureka.feign.client.service.RemoteService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ：hjl
 * @date ：2019/9/26 17:24
 * @description： 测试controller
 * @modified By：
 */
@RestController
@RequestMapping("/feign")
public class TestController {
    @Resource
    private RemoteService remoteService;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){

        return remoteService.hello() + ",hello!!!!";
    }
}
