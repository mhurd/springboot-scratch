package com.mhurd.scratch.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class SampleController {

    @Value("${server.message}")
    private String message;

    @RequestMapping("/secure/message")
    @ResponseBody
    String message() {
        return message;
    }

}
