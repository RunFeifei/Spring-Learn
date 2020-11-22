package com.fei.run.controller;


import com.fei.run.mapper.UserMapper;
import com.fei.run.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
    public List<UserEntity> getAllUsers() {
        return userMapper.getAllUsers();
    }

    @RequestMapping(value = "/getUserDetail/{userid}", method = RequestMethod.GET)
    UserEntity getUserDetail(@PathVariable Long userid) {
        return userMapper.getUserDetail(userid);
    }

    @RequestMapping(value = "/userLogin", method = RequestMethod.POST)
    public UserEntity userLogin(@ModelAttribute UserEntity userEntity) {
        return userMapper.userLogin(userEntity);
    }

    @RequestMapping(value = "/userLogout", method = RequestMethod.POST)
    public void userLogout(@ModelAttribute UserEntity userEntity) {
        userMapper.userLogout(userEntity);
    }

    @RequestMapping(value = "/userUpdate", method = RequestMethod.POST)
    public UserEntity userUpdate(@ModelAttribute UserEntity userEntity) {
        userMapper.userUpdate(userEntity);
        return userEntity;
    }

    @RequestMapping(value = "/userRegister", method = RequestMethod.POST)
    public UserEntity userRegister(@ModelAttribute UserEntity userEntity) {
        userMapper.userRegister(userEntity);
        return userEntity;
    }


}
