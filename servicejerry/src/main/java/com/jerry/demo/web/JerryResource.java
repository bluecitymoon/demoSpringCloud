package com.jerry.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.Inet4Address;
import java.net.UnknownHostException;

/**
 * Created by Jerry on 2017/6/19.
 */
@RestController
public class JerryResource {

    @RequestMapping(value = "/speak", method = RequestMethod.GET)
    public String speak() {
        try {
            return "Hello world, I am at " + Inet4Address.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();

            return "Hello, I don't know where I am";
        }
    }
}
