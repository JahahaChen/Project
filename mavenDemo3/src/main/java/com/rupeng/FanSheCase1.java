package com.rupeng;

import jdk.internal.dynalink.linker.MethodHandleTransformer;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author: chenjiaheng
 * @date ：2019-11-24 09:50
 * @description:
 * @modified By：
 **/
public class FanSheCase1
{
    /**
     * 获得obj指向的对象的propName属性的值
     * @param obj
     * @param propName
     */
    public  static  Object getValue(Object obj,String propName)
    {
        Class clz = obj.getClass();

        Object objInvoke=null;
        try
        {
            String getMethodName= "get"+capitalize(propName);
            Method getMethod = clz.getMethod(getMethodName);
            objInvoke = getMethod.invoke(obj);
        }
        catch (NoSuchMethodException e)
        {
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }
        catch (InvocationTargetException e)
        {
            e.printStackTrace();
        }
        return  objInvoke;
    }


    /**
     * 设置值
     * @param obj
     * @param propName
     */
    public  static  void setValue(Object obj ,String propName,Object value,Class valueClass)
    {
       Class clz = obj.getClass();

        try
        {
            String setMethodName = "set"+ capitalize(propName);
            Method method = clz.getMethod(setMethodName,valueClass);
            method.invoke(obj,value);
        }
        catch (NoSuchMethodException e)
        {
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }
        catch (InvocationTargetException e)
        {
            e.printStackTrace();
        }
    }

    /**
     *  将首字母大写，比如capitalize("age")就得到”Age“
     * @param
     * @return
     */
    private  static  String capitalize(String s)
    {
          char firstChar =  s.charAt(0);
          return  Character.toUpperCase(firstChar)+s.substring(1);
    }


    public static void main(String[] args)
    {
          Chinese c1 = new Chinese();
//        c1.setAge(20);
//        c1.setName("cjh");

        //设置值
        setValue(c1,"age",18,int.class);


        int age = (Integer) getValue(c1,"age");
        System.out.println(age);



    }


}
