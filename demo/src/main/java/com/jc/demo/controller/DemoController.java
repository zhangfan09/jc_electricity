package com.jc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    @RequestMapping("index")
    @ResponseBody
    public  String Hello(){
        System.out.print("+++++++++++++++++++++++++++++++++");
        return "welcome to jc-project";
    }
}
