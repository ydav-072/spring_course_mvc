package com.springApp.springMVC.proj.firstLesson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showView(){
        return "first-view";
    }
}
