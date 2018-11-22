package com.demo.Service;

import com.demo.Mapper.UserMapper;
import com.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public Person selectUser(int id) {
        return userMapper.selectUser(id);
    }

    public Person selectName(String name) {
        return userMapper.selectName(name);
    }

}
