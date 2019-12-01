package com.rupeng;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

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
        /*
        AdminUser adminUser = new AdminUser();
        Class clz = adminUser.getClass();
        System.out.println(clz.getName());  //得到类名（包含包名）

        Field [] files= clz.getFields();


        ArrayList<String> arrayList = new ArrayList<String>();



        if (files.length>0)
        {
            for (Field f: files)
            {
                System.out.println(f);
            }
        }*/


        /*
        int []nums = {1,23,3,4,5,33,4,21};
        String  s= Arrays.toString(nums);  //把一个数组快速的打出来
        System.out.println(s);*/


        /*
        int []nums = {1,23,3,4,5,33,4,21};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));*/


        int []nums = {1,23,3,4,5,33,4,21};
        int []nums2 = {1,23,3,4,5,33,4,21};

        System.out.println(nums==nums2);   //比较的是否是同一个对象

        System.out.println(nums.equals(nums2)); //调用的是Object的 equals 方法

        System.out.println(Arrays.equals(nums,nums2));  //通过调用Arrays equals 方法，比较的是值是否相等



    }
}
