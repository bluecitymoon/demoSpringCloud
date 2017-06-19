package com.jerry.registry.web;

import com.jerry.registry.client.JerryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jerry on 2017/6/19.
 */
@RestController
public class GrimmResource {

    @Autowired
    JerryClient jerryClient;

    @RequestMapping(value = "/speakToJerry", method = RequestMethod.GET)
    public String speak() {

        String answerFromJerry = jerryClient.getWhatJerrySpeak();

        return "Grimm says hi, and Jerry responds " + answerFromJerry;
    }
}
