package com.fei.run.mapper;

import com.fei.run.model.UserEntity;

import java.util.List;

public interface UserMapper {

    List<UserEntity> getAllUsers();

    UserEntity getUserDetail(Long userid);

    UserEntity userLogin(UserEntity userEntity);

    void userLogout(UserEntity userEntity);

    void userUpdate(UserEntity userEntity);

    void userRegister(UserEntity userEntity);
}
