package com.chives.scaffold.service.impl;

import com.chives.scaffold.entity.User;
import com.chives.scaffold.mapper.UserMapper;
import com.chives.scaffold.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @AUthor yingluSun
 * @Date 2019/9/4 15:48
 **/
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    public List<User> queryUser(){
        return userMapper.queryUser();
    }

    public void  addUser(User user){
         userMapper.addUser(user);
    }


}
