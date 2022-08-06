package com.jc.juser.service;

import com.jc.juser.pojo.SysUser;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SysUserService {

    /**
     * @Author ZhangFan
     * @Description //查询系统用户操作
     * @Date 19:00 2022/7/31
     * @Param []
     * @return java.util.List<com.jc.springbootmybatis.pojo.SysUser>
     **/
    @Select("SELECT USER_NAME FROM sys_user")
    List<SysUser> queryUserList();
}
