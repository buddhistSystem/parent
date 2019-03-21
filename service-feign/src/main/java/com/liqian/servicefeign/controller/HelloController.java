package com.liqian.servicefeign.controller;

import com.liqian.servicefeign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Administrator
 * @Date: 2018/10/17 0017 11:16
 * @Description:
 */
@RestController
@RefreshScope
public class HelloController {

    @Autowired
    private FeignService feignService;

    @RequestMapping(value = "/hi")
    public String sayHello(){
       String string=feignService.sayhello();
        return string;
    }

    @Value("${env}")
    String foo;
    @RequestMapping(value = "/env")
    public String hi(){
        return foo;
    }

}
