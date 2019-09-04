package com.chives.scaffold.controller;

import com.chives.scaffold.entity.User;
import com.chives.scaffold.service.impl.UserServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @AUthor yingluSun
 * @Date 2019/9/4 15:53
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserServiceImpl userService;

    @RequestMapping("queryUser")
    public PageInfo<User> queryUser(){
        PageHelper.startPage(1, 10);
        List<User> users = userService.queryUser();
        PageInfo<User> userPageInfo = new PageInfo<>(users);
        return userPageInfo;
    }
    @RequestMapping("addUser")
    public String  addUser(User user){
        userService.addUser(user);
        return "添加成功";
    }


}
