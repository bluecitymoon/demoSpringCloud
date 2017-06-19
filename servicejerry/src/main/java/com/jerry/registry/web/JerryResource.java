package com.jerry.registry.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jerry on 2017/6/19.
 */
@RestController
public class JerryResource {

    @RequestMapping(value = "/speak", method = RequestMethod.GET)
    public String speak() {
        return "Hello world ";
    }
}
