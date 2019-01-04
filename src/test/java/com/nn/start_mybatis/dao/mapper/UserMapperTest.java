package com.nn.start_mybatis.dao.mapper;


import com.nn.start_mybatis.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 基于Mybatis dao test
 */
@RunWith(SpringRunner.class)
@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE ) //是否使用替换数据库--不替换 不替换 默认替换

public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    @Rollback(true)
    public void getUserById(){
        baseTest(1);


    }
    @Test
    @Rollback
    public void add(){
        User addUser = new User();
        addUser.setUsername("AddUser");
        addUser.setAge(10);
        int id = userMapper.add(addUser);
        baseTest(id);
    }

    @Test
    @Rollback
    public void update(){
        User addUser = new User();
        addUser.setUsername("AddUser");
        addUser.setAge(10);
        int id = userMapper.add(addUser);
        addUser.setId(id);
        userMapper.update(id,addUser);

        User user = userMapper.getUserById(id);

        Assert.assertEquals(user.getUsername(),"AddUser");


    }

    @Test
    @Rollback
    public void del(){
        User user = userMapper.getUserById(1);
        int delId = userMapper.del(user.getId());
        Assert.assertEquals(delId,1);
    }

    private void  baseTest(int id){
        User user =  userMapper.getUserById(id);
        Assert.assertNotNull(user);
        Assert.assertEquals(user.getId(),id);
    }

//
//    @Select("Select * from tb_user where id= #{id}")
//    User getUserById(Integer id);
//
//    @Insert("insert into tb_user(" + COLUMN + ") values(#{username},#{age},now())")
//    int add(User user);
//
//    @Update("update tb_user set username=#{user.username} ,age=#{user.age},ctm=now() where id=#{id}  ")
//    int update(@Param("id") int id, @Param("user") User user);
//
//    @Delete("delete from tb_user where id=#{id}")
//    int del(int id);






}
