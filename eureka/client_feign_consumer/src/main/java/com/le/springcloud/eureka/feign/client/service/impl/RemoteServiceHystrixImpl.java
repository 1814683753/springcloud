package com.le.springcloud.eureka.feign.client.service.impl;

import com.le.springcloud.eureka.feign.client.service.RemoteService;
import org.springframework.stereotype.Component;

/**
 * @author ：hjl
 * @date ：2019/12/9 16:47
 * @description：
 * @modified By：
 */
@Component
public class RemoteServiceHystrixImpl implements RemoteService {
    /**
     * 测试
     *
     * @return
     */
    @Override
    public String hello() {
        return "RemoteServiceHystrixImpl";
    }
}
