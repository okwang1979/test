package com.nn.start_mybatis.service;

import com.nn.start_mybatis.entity.User;

public interface IUserService {



    public User getUserById(Integer id);

    public int saveOrUpdate(User user);


    public int delUser(int id);
}
