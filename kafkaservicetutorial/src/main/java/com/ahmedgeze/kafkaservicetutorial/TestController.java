package com.ahmedgeze.kafkaservicetutorial;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
@RefreshScope
public class TestController {

    @Value("${kafka.local.servername}")
    private String conf;

    @Value("${database.name}")
    private String dbconf;


    @RequestMapping(value = "/getparam",method = RequestMethod.GET)
    public String getConfig(){
        return conf;
    }

    @RequestMapping(value = "/getdb",method = RequestMethod.GET)
    public String getDbConfig(){
        return dbconf;
    }
}
