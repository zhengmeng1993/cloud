package com.example.service.impl;

import com.example.service.HomeService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class HomeServiceImpl implements HomeService {
    @Autowired
    private RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "backMethod")
    public String indexService(){

        return restTemplate.getForEntity("http://service/index",String.class).getBody()/**/;

    }
    private String backMethod(){
        return "error";
    }

}
