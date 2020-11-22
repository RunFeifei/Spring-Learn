package com.fei.run.mapper;

import com.fei.run.model.UserEntity;

import java.util.List;

public interface UserMapper {

    List<UserEntity> getAllUsers();

    UserEntity getUserDetail(Long userid);

    void userLogin(UserEntity userEntity);

    void userLogout(UserEntity userEntity);

    UserEntity userUpdate(UserEntity userEntity);

    UserEntity userRegister(UserEntity userEntity);
}
