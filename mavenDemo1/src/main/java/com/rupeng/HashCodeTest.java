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
