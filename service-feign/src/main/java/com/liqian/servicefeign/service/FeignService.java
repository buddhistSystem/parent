package com.liqian.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @Auther: Administrator
 * @Date: 2018/10/17 0017 11:13
 * @Description:
 */
@FeignClient(value = "SERVICE-PROVIDER",fallback = FeignServiceError.class)
public interface FeignService {

    @RequestMapping(value = "/hi")
    String sayhello();
}
