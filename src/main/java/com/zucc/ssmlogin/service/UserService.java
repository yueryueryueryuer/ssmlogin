package com.zucc.ssmlogin.service;

/**
 * Created by Taoxiao on 2017/5/14 0014.
 * Describe:
 */
public interface UserService {
    public boolean login(String username,String password);
    public boolean sign(String username,String password);
}
