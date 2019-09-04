package com.chives.scaffold.mapper;

import com.chives.scaffold.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select a.id,a.name,a.password,a.username from user a ")
    List<User> queryUser();

    @Insert("insert into user(username,password,name) value(#{username},#{password},#{name})")
    void addUser(User user);
}
