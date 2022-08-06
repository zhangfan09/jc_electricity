package com.jc.juser.dao;


import com.jc.juser.pojo.SysUser;
import com.jc.juser.util.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

    /**
     * @Author ZhangFan
     * @Description //查询系统用户操作
     * @Date 19:00 2022/7/31
     * @Param []
     * @return java.util.List<com.jc.springbootmybatis.pojo.SysUser>
     **/

    List<SysUser> queryUserList();
}