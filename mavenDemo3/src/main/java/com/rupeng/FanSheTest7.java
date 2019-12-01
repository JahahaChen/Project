package com.rupeng;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.SortedMap;

/**
 * @author: chenjiaheng
 * @date ：2019-11-23 17:08
 * @description:
 * @modified By：
 **/
public class FanSheTest7
{
    public static void main(String[] args)
    {

        try
        {
            Class clz = Class.forName("com.rupeng.Chinese");
            Object person = clz.getConstructor().newInstance();   //相当于 new Chinese


            Object person2 = clz.newInstance();       //相当于 new Chinese
            System.out.println(person.getClass());


            Method setAgeMethod = clz.getMethod("setAge",int.class);
            setAgeMethod.invoke(person,30);//相当于 person.setAge(300)

            Method setNameMethod = clz.getMethod("setName",String.class);
            setNameMethod.invoke(person,"john");

            Method setHelloMethod =clz.getMethod("sayHello");
            setHelloMethod.invoke(person);
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (InstantiationException e)
        {
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }
        catch (IllegalArgumentException e)
        {
            e.printStackTrace();
        }
        catch (InvocationTargetException e)
        {
            e.printStackTrace();
        }
        catch (NoSuchMethodException e)
        {
            e.printStackTrace();
        }
        catch (SecurityException e)
        {
            e.printStackTrace();
        }

    }
}
