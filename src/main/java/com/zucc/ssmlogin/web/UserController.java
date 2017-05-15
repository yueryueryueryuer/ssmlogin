package com.zucc.ssmlogin.web;

import com.zucc.ssmlogin.entity.User;
import com.zucc.ssmlogin.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Taoxiao on 2017/5/14 0014.
 * Describe:
 */
//@Controller注解用于标示本类为web层控制组件
@Controller
//@RequestMapping("/user")用于标定访问时对url位置
@RequestMapping("/user")
//在默认情况下springmvc的实例都是单例模式,所以使用scope域将其注解为每次都创建一个新的实例
@Scope("prototype")
public class UserController {
    //自动注入业务层的userService类
    @Autowired
    UserService userService;

    //跳转到登录界面
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    //跳转到注册界面
    @RequestMapping("/signlogin")
    public String signlogin(){
        return "sign";
    }
    //验证登录
    @RequestMapping("/checklogin")
    public String checklogin(User user, HttpServletRequest request){
        //调用login方法来验证是否是注册用户
        boolean loginType = userService.login(user.getUsername(),user.getPassword());
        if(loginType){
            //如果验证通过,则将用户信息传到前台
            request.setAttribute("user",user);
            //并跳转到success.jsp页面
            return "success";
        }else{
            //若不对,则将错误信息显示到错误页面
            request.setAttribute("message","用户名密码错误");
            return "error";
        }
    }
    //注册检验
    @RequestMapping("/checksign")
    public String checksign(User user, HttpServletRequest request){
        //验证用户名是否重复
        boolean signType = userService.sign(user.getUsername(),user.getPassword());
        if(signType){
            request.setAttribute("user",user);
            //跳转到success.jsp页面
            return "successlogin";
        }else{
            //若不对,则将错误信息显示到错误页面
            request.setAttribute("user",user);
            return "errorlogin";
        }
    }

}
