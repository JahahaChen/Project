package com.rupeng;


import java.lang.reflect.Field;

/**
 * @author: chenjiaheng
 * @date ：2019-11-23 16:04
 * @description:
 * @modified By：
 **/
public class FanSheTest5
{
    public static void main(String[] args) throws NoSuchFieldException
    {
        Class clz = Chinese.class;
        /*
        Field faa = clz.getField("count");  //获取某一个变量，已经知道名字的变量
        System.out.println(faa);
        System.out.println("变量的名字:"+faa.getName());
        System.out.println("变量的类型:"+faa.getGenericType());*/


        System.out.println("getFields");
        for (Field f : clz.getFields())  //获取本类及其父类中所有的public成员
        {
            System.out.println("变量名："+f.getName()+",变量的类型："+f.getGenericType());
        }

        System.out.println("getDeclaredFields");  //获取本类的变量，但是把本类中的 public  private的都拿出来了
        for (Field f : clz.getDeclaredFields())
        {
            System.out.println("变量名："+f.getName()+",变量的类型："+f.getGenericType());
        }








    }
}
