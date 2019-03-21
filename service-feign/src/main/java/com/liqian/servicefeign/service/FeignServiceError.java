package com.liqian.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * @Auther: Administrator
 * @Date: 2018/10/18 0018 09:26
 * @Description:
 */
@Component
public class FeignServiceError implements  FeignService{

    @Override
    public String sayhello() {
        return "FeignService发生错误，熔断启动！";
    }
}
