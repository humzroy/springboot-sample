package com.zhen.springbootsample.mapper;

import com.zhen.springbootsample.modle.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.zhen.springbootsample.mapper")
public class UserMapperTest {
    @Autowired
    private UserMapper mapper;

    @Test
    public void testInset() {
        User user = new User("admin", "管理员", "0001", "18353238798", "123456");
        int i = mapper.insert(user);
        Assert.assertNotEquals(0, i);
    }


    @Test
    public void testSelectByName() {
        User user = mapper.selectByName("管理员");
        Assert.assertNotEquals(null, user);
        System.out.println(user.toString());
    }
    @Test
    public void testSelectByCde() {
        User user = mapper.selectByCde("admin");
        Assert.assertNotEquals(null, user);
        System.out.println(user.toString());
    }
}