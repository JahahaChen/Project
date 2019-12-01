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
    private  T [] data;
    private  int currentSize=0;

    //add
    public  void  add(T t)
    {
        if (currentSize>data.length)
        {
            for (int i=0;i<data.length;i++)
            {
                Object[] objects  = new Object[10];


            }
        }
    }
}
