package com.jie;


import com.jie.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisPlusApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {

//        User user = new User();
//
//        user.setName("jie");
//        user.setAge(18);
//        user.setEmail("1154404368@qq.com");
////        List<User> users = userMapper.selectList(null);
//
//        int insert = userMapper.insert(user);
//        System.out.println(user);

         userService.list().forEach(System.out::println);
    }
    @Test
    void testPage(){


    }


    @Test
    void testDelete(){

    }





}
