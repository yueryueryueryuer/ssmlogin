package com.zucc.ssmlogin.dao;

import com.zucc.ssmlogin.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by Taoxiao on 2017/5/14 0014.
 * Describe:
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class UserDaoTest {
    @Resource
    private UserDao userDao;

    @Test
    public void selectByName() throws Exception {
        String username="taoxf";
        User user = userDao.selectByName(username);
        System.out.println(user);
    }
}