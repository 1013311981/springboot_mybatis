package com.mybatis.controller;

import com.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 包名: com.mybatis.controller
 * 作者: Lx
 * 日期: 2019/3/23 0:24
 */

@RestController
@RequestMapping("/testBoot")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/getUser/{id}")
    public String GetUser(@PathVariable int id){
        return userService.Sel(id).toString();
    }

}

