package com.rupeng;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.SortedMap;

/**
 * @author: chenjiaheng
 * @date ：2019-11-23 15:47
 * @description:
 * @modified By：
 **/
public class FanSheTest4
{
    public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException,InstantiationException
    {
       Class clzCheinese = Chinese.class;
       Constructor c1= clzCheinese.getConstructor(int.class,String.class);
       System.out.println(c1);
       Object obj = c1.newInstance(999,"长寿");// new Person()；
       System.out.println(obj);


//       Constructor c2= clzCheinese.getConstructor(String.class,String.class);
//       System.out.println(c2);

        Constructor c3 = clzCheinese.getConstructor(String.class);
        System.out.println(c3);
        Object obj3 =c3.newInstance("tom");
        System.out.println(obj3);



        //拿到所有的构造函数并打印出来
//        for (Constructor c : clzCheinese.getConstructors())
//        {
//            System.out.println(c);
//        }
    }
}
