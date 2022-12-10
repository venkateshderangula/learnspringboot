package com.upgrad.practice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/page1")
    public String page1(){
        return "This is the first task of this exercise";
    }

    @RequestMapping("/page2")
    public String page2(){
        return "This is the second task of this exercise";
    }
}
