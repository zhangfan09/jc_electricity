package com.jc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("userPage")
    public  String UserPage(){
        System.out.print("用户信息查询");
        return  "aaaa";
    }

}
