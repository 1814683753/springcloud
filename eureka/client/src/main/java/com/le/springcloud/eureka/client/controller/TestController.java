package com.le.springcloud.eureka.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：hjl
 * @date ：2019/9/26 17:24
 * @description： 测试controller
 * @modified By：
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }
}
