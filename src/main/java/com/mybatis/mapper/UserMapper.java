package com.mybatis.mapper;

import com.mybatis.entity.User;
import org.springframework.stereotype.Repository;

/**
 * 包名: com.mybatis.mapper
 * 作者: Lx
 * 日期: 2019/3/23 0:28
 */
@Repository
public interface UserMapper {

    User Sel(int id);
}
