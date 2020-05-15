package com.example.demo.mapper;

import com.example.demo.po.UserPO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    UserPO getByUserId(long userId);
}
