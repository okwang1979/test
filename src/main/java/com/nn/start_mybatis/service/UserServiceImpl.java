package com.nn.start_mybatis.service;

import com.nn.start_mybatis.dao.UserDao;
import com.nn.start_mybatis.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer id) {
        return userDao.getUserById(id);
    }

    @Override
    public int saveOrUpdate(User user) {
        if (user.getId() == 0) {
            return userDao.add(user);
        } else {
            return userDao.update(user.getId(), user);
        }

    }

    @Override
    public int delUser(int id) {
        return this.userDao.del();

    }
}
