package com.rupeng;

import org.apache.logging.log4j.core.appender.routing.PurgePolicy;

/**
 * @author: chenjiaheng
 * @date ：2019-11-19 20:12
 * @description: MyGenericArrayList
 * @modified By：
 **/
public class MyGenericArrayList<T>
{
    private  T [] data=new T [10];
    private  int currentSize=0;

    //add
    public  void  add(T t)
    {
        if (currentSize>data.length)
        {
            for (int i=o;i<data.length;i++)
            {
                Object[] objects  = new Object[10];
                T[] newT = new T[data.length+10];
            }
        }
    }
}
