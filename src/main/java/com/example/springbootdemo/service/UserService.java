package com.example.springbootdemo.service;

import com.example.springbootdemo.pojo.User;
import com.example.springbootdemo.pojo.dto.UserDto;
import com.example.springbootdemo.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User add(UserDto userDto) { // 建议参数名改为userDto，更明确
        // 1. 创建目标实体对象
        User userPojo = new User();
        // 2. 【修正】将DTO的属性复制到目标实体对象中
        BeanUtils.copyProperties(userDto, userPojo); // ✅ 正确：复制到 userPojo
        // 3. 保存到数据库
        User savedUser = userRepository.save(userPojo);
        // 4. 返回保存后的对象
        return savedUser;
    }
    @Override
    public User getUser(Integer userId){
        return userRepository.findById(userId).orElseThrow(() -> {
            throw new IllegalArgumentException("用户不存在,参数异常");
        });
    }

    @Override
    public User edit(UserDto user) {
        User userPojo=new User();
        BeanUtils.copyProperties(user,userPojo);
        return userRepository.save(userPojo);

    }

    @Override
    public void delete(Integer userId) {
        userRepository.deleteById(userId);
    }
}
