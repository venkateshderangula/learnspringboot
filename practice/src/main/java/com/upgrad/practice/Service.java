package com.upgrad.practice;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Profile("dev")
@RestController
public class Service {

    @RequestMapping("/page3")
    public String helloWorld(){
    return "Hello World!";
}
}
