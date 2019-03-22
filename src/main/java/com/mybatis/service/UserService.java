package com.mybatis.service;

import com.mybatis.entity.User;
import com.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 包名: com.mybatis.service
 * 作者: Lx
 * 日期: 2019/3/23 0:26
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public User Sel(int id) {
        return userMapper.Sel(id);
    }
}
