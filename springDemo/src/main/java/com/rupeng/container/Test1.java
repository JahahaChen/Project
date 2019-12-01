package com.rupeng.container;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sound.midi.Soundbank;

/**
 * @author: chenjiaheng
 * @date ：2019-11-24 14:01
 * @description:
 * @modified By：
 **/
public class Test1
{
    @Test
    public void test1()
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/rupeng/container/beans.xml");


        UserService userService= applicationContext.getBean(UserService.class);

        UserService userService1= (UserService)applicationContext.getBean("userService");

        System.out.println(userService);
        System.out.println(userService1);
    }
}
