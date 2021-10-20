package com.smart.demo.mapper;

import com.smart.demo.entity.User;
import org.apache.ibatis.annotations.Param;

// Dao 接口
public interface UserMapper {
    int insert();
    User selectByName(@Param("username") String name);
}
