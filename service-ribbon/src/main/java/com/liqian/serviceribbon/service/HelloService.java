package com.liqian.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: Administrator
 * @Date: 2018/10/17 0017 09:57
 * @Description:
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "errorMethod")
    public String hiService() {
        return restTemplate.getForObject("http://SERVICE-PROVIDER/hi",String.class);
    }

    public String errorMethod(){
        return "service1--sayHello方法发生错误";
    }

}
