package com.jc.juser.controller;

import com.jc.juser.pojo.SysUser;
import com.jc.juser.service.SysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LoginController {
    private static Logger logger = LoggerFactory.getLogger(SysUserService.class);

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("login")
    public  String login(){
        System.out.println("已进入login方法-----------------------------------------");
        return "login";
    }

    @RequestMapping("/userPage")
    @ResponseBody
    public List UserPage(){
        List<SysUser>  userList = sysUserService.queryUserList();
        String  str = "";
        List str1 = new ArrayList();
        str1.add(1);
        str1.add(2);
        str1.add(3);
        str1.add(4);
        List  a =new ArrayList();
        for(SysUser user : userList){
            for(Object ss:str1){
                if(user.getUserName().equals("小沥青")){
                    str = user.getUserName()+"今天第"+ss+"次想吃屎了";
                    logger.info("试试输出结果为：" + str + "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                    a.add(str);
                }
            }
        }
        return a;
    }
}
