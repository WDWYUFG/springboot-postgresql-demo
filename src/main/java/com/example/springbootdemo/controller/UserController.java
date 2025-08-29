package com.example.springbootdemo.controller;

import com.example.springbootdemo.pojo.ResponseMessage;
import com.example.springbootdemo.pojo.User;
import com.example.springbootdemo.pojo.dto.UserDto;
import com.example.springbootdemo.service.IUserService;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    IUserService userService;

    //增加
    @PostMapping
    public ResponseMessage add(@Validated @RequestBody UserDto user){
        User userNew=userService.add(user);
        return ResponseMessage.success(userNew);
    }

    //查询
    @GetMapping("/{userId}")
    public ResponseMessage get(@PathVariable Integer userId){
        User userNew=userService.getUser(userId);
        return ResponseMessage.success(userNew);
    }

    //修改
    @PutMapping
    public ResponseMessage edit(@Validated @RequestBody UserDto user) {
        User userNew = userService.edit(user);
        return ResponseMessage.success(userNew);
    }

    //删除
    @DeleteMapping("/{userId}")
    public ResponseMessage delete(@PathVariable Integer userId){
        userService.delete(userId);
        return ResponseMessage.success();

    }
}
