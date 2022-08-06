package com.jc.juser.service.impl;

import com.jc.juser.dao.SysUserMapper;
import com.jc.juser.pojo.SysUser;
import com.jc.juser.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.logging.Logger;

@Service
public class SysUserServiceImpl  implements SysUserService {
    //第一种方式，INTERFACE-METHOD-ONE 实在xml中配置的一个日志name
    private static Logger logger = Logger.getLogger("INTERFACE-METHOD-ONE");
    //第二种方式：UserServiceImpl.class 是该类的class
//    private static Logger logger2 = Logger.getLogger(SysUserServiceImpl.class);

    @Resource
    private SysUserMapper sysUserMapper;

    /**
     * @Author ZhangFan
     * @Description //查询系统用户操作 
     * @Date 19:01 2022/7/31
     * @Param []
     * @return java.util.List<com.jc.springbootmybatis.pojo.SysUser>
     **/
    @Override
    public List<SysUser> queryUserList() {
        List<SysUser>  userList = sysUserMapper.queryUserList();
        logger.info("当前用户返回结果：" + userList.toString() + "========================");
        return userList;
    }
}
