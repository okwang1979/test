package com.nn.start_mybatis.dao;

import com.nn.start_mybatis.vo.User;
import org.apache.ibatis.annotations.*;

public interface UserDao {

    String COLUMN = "username,age,ctm";

    @Select("Select * from tb_user where id= #{id}")
    User getUserById(Integer id);

    @Insert("insert into tb_user(" + COLUMN + ") values(#{username},#{age},now())")
    int add(User user);

    @Update("update tb_user set username=#{user.username} ,age=#{user.age},ctm=now() where id=#{id}  ")
    int update(@Param("id") int id, @Param("user") User user);

    @Delete("delete from tb_user where id=#{id}")
    int del(int id);


}
