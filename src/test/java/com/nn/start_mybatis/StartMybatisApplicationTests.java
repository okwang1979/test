package com.nn.start_mybatis;

import com.nn.start_mybatis.vo.ContextValue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StartMybatisApplicationTests {

    @Autowired
    private ContextValue cValue;

    @Test
    public void contextLoads() {

    }

}
