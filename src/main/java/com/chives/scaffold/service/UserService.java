package com.chives.scaffold.service;

import com.chives.scaffold.entity.User;
import java.util.List;

public interface UserService {

   List<User> queryUser();

   void  addUser(User user);

}
