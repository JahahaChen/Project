package com.rupeng;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.SortedMap;

/**
 * @author: chenjiaheng
 * @date ：2019-11-23 16:25
 * @description:
 * @modified By：
 **/
public class FanSheTest6
{
    public static void main(String[] args)
    {

        Class clz = Chinese.class;
        /*
        for (Method m : clz.getMethods())
        {
            System.out.println("方法名："+m.getName()+",方法返回值类型:"+m.getReturnType());
        }*/

        for (Method m:clz.getDeclaredMethods())
        {
            System.out.println("方法名："+m.getName()+",方法返回值类型:"+m.getReturnType()+",修饰符："
                    + Modifier.isPrivate(m.getModifiers()));
        }




    }
}
