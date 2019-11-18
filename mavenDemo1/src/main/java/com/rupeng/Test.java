package com.rupeng;

import java.lang.reflect.Field;

/**
 * @author: chenjiaheng
 * @date ：2019-11-18 17:55
 * @description:
 * @modified By：
 **/
public class Test
{
    public static void main(String[] args)
    {
        AdminUser adminUser = new AdminUser();
        Class clz = adminUser.getClass();
        System.out.println(clz.getName());  //得到类名（包含包名）

        Field [] files= clz.getFields();



        if (files.length>0)
        {
            for (Field f: files)
            {
                System.out.println(f);
            }
        }

    }
}
