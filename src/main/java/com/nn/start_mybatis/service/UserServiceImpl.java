package com.nn.start_mybatis.service;

import com.nn.start_mybatis.dao.mapper.UserMapper;
import com.nn.start_mybatis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    @Override
    public int saveOrUpdate(User user) {
        if (user.getId() == 0) {
            return userMapper.add(user);
        } else {
            return userMapper.update(user.getId(), user);
        }

    }

    @Override
    public int delUser(int id) {
        return this.userMapper.del(id);

    }
}
