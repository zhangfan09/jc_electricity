package com.jc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("login")
    public String Login(){
        System.out.print("登录功能开发");
        return "当前登录页面";
    }

    @RequestMapping("register")
    public String register(){
        System.out.print("注册功能开发");
        return "跳转至登录";
    }
}
