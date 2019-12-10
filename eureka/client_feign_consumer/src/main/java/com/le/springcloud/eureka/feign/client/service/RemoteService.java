package com.le.springcloud.eureka.feign.client.service;

import com.le.springcloud.eureka.feign.client.service.impl.RemoteServiceHystrixImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// name的值需要与spring.application.name的值一致
@FeignClient(name = "client-test",fallback = RemoteServiceHystrixImpl.class)
/**
 * @author ：hjl
 * @date ：2019/11/6 17:42
 * @description： 远程接口
 * @modified By：
 */
public interface RemoteService {
    /**
     * 测试
     * @return
     */
    @RequestMapping("/test/hello")
    @ResponseBody
    String hello();
}
