package com.rupeng;

import java.util.HashMap;

/**
 * @author: chenjiaheng
 * @date ：2019-11-18 16:38
 * @description: hash code Test
 * @modified By：
 **/
public class HashCodeTest
{
    public static void main(String[] args)
    {

//        Object object =new Object();
//        System.out.println(object.hashCode());
//
//
//        String string = "abc";
//        System.out.println(string.hashCode());
//
//        AdminUser adminUser  = new AdminUser();
//        System.out.println(adminUser.hashCode());


//        int h = 0;
//
//        char [] c = new char[3];
//        c[0]='a';
//        c[1]='b';
//        c[2]='c';
//
//        for (int i=0;i<c.length;i++)
//        {
//            h = 31 * h + c[i];
//        }
//        System.out.println(h);




        HashMap map1 = new HashMap();
        map1.put("河北","石家庄");
        map1.put("河南","郑州");

        System.out.println(map1.size());

        Object obj1 = map1.get("河北");
        System.out.println(obj1);

        Object obj2 = map1.get("安徽");  //没有该键，就返回的值为null
        System.out.println(obj2);

    }
}
