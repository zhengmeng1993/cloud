package com.example.web;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
    private final Logger logger = Logger.getLogger(getClass());
    @Autowired
    private DiscoveryClient discoveryClient;
    @RequestMapping("index")
    public String index(){
        ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
        logger.info("ip{}:{}"+serviceInstance.getHost()+ serviceInstance.getServiceId());
        return "hello word";
    }
}
