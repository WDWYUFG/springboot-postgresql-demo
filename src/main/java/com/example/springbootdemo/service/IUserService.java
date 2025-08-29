package com.example.springbootdemo.service;

import com.example.springbootdemo.pojo.User;
import com.example.springbootdemo.pojo.dto.UserDto;


public interface IUserService {
    /**
     * @param user
     * @return
     */
    User add(UserDto user);
    /**
     * 查询用户
     * @param userId 用户id
     * @return
     */
    User getUser(Integer userId);

    /**
     * 修改用户
     * @param user 修改用户对象
     * @return
     */
    User edit(UserDto user);

    /**
     * 删除
     *
     * @param userId
     */
    void delete(Integer userId);
}
