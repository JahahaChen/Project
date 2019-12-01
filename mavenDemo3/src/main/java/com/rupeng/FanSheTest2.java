package com.rupeng;

import sun.util.resources.th.CalendarData_th;

/**
 * @author: chenjiaheng
 * @date ：2019-11-23 15:08
 * @description:
 * @modified By：
 **/
public class FanSheTest2
{
    public static void main(String[] args)
    {
        Class clz = Person.class;
        try
        {
            //调用clz指向的Class对象对应的类无参构造函数，并且返回创建的对象
           Object obj =  clz.newInstance();
           System.out.println(obj);
           System.out.println(clz.getName());


            Class clzParent = clz.getSuperclass();//得到父类的Class对象  Object
            System.out.println(clzParent);
            Class clzObjectParent = clzParent.getSuperclass(); // 看下Object 的父类是什么  null
            System.out.println(clzObjectParent);

        }
        catch (IllegalAccessException ex)
        {
           ex.printStackTrace();
        }
        catch (InstantiationException ex)
        {
            ex.printStackTrace();
        }
    }
}
