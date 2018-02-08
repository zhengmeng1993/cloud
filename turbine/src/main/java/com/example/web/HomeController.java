package com.example.web;

import com.example.service.HomeService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@ComponentScan("com.example")
public class HomeController {
    private final Logger logger = Logger.getLogger(getClass());
    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private HomeService homeService;
    @RequestMapping("index")
    public String index(){
        return homeService.indexService();
      /*  ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
        logger.info("ip{}:{}"+serviceInstance.getHost()+ serviceInstance.getServiceId());
        return "hello word";*/
    }
}
