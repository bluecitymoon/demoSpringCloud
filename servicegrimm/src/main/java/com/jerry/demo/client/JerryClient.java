package com.jerry.demo.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Jerry on 2017/6/19.
 */
@FeignClient(name = "servicejerry")
public interface JerryClient {

    @RequestMapping(method = RequestMethod.GET, value = "/jerry/speak")
    public String getWhatJerrySpeak();
}
