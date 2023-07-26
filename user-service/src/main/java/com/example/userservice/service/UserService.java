package com.example.userservice.service;

import com.example.userservice.domain.User;
import com.example.userservice.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findById(Long id){
        return userMapper.selectOne(id);
    }


    @Transactional
    public int createUser(User user) throws Exception {
        int count = userMapper.insert(user);
        if (count == 1) {
            throw new Exception("不允许创建用户！");
        }
        return count;
    }

    public int addUser(User user) throws Exception {
        int count = createUser(user);
        if (count == 1) {
            throw new RuntimeException("添加用户不允许成功！");
        }
        return count;
    }
}
