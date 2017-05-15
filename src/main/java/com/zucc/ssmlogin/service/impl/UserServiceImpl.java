package com.zucc.ssmlogin.service.impl;

import com.zucc.ssmlogin.dao.UserDao;
import com.zucc.ssmlogin.entity.User;
import com.zucc.ssmlogin.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Taoxiao on 2017/5/14 0014.
 * Describe:
 */
//@Service("UserService") 注解用于标示此类为业务层组件,在使用时会被注解的类会自动由
//spring进行注入,无需我们创建实例
@Service("UserService")
public class UserServiceImpl implements UserService {

    //自动注入iuserdao 用于访问数据库
    @Autowired
    UserDao Mapper;

    //登录方法的实现,从jsp页面获取username与password
    public boolean login(String username, String password) {
        User user = Mapper.selectByName(username);
        if(user!=null){
            if (user.getUsername().equals(username)&&user.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
    //注册
    public boolean sign(String username,String password) {
        if(Mapper.selectByName(username)==null){//如果等于空，说明数据库中没有改用户名，那么可以注册
            Mapper.insertUser(username,password);
            return true;
        }
        return false;
    }
}
