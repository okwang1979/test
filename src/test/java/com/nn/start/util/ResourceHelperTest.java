package com.nn.start.util;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.Properties;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ResourceHelperTest {

    @Test
    public void getFileProperties() {
        String fileName = "config";
        try {
            Properties properties = ResourceHelper.getFileProperties(fileName);
            Assert.assertTrue(properties!=null);
            Assert.assertTrue(properties.size()>0);
        } catch (IOException e) {
            e.printStackTrace();
            Assert.assertTrue(false);
        }
    }

}
