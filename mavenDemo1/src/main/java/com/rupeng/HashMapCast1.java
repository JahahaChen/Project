package com.rupeng;

import java.util.HashMap;
import java.util.Set;

/**
 * @author: chenjiaheng
 * @date ：2019-11-23 10:34
 * @description:
 * @modified By：
 **/
public class HashMapCast1
{
    public static void main(String[] args)
    {
        String str = "There are moments in life when you miss someone so much that you " +
                "just want to pick them from your dreams and hug them for real! Dream what " +
                "you want to dream;go where you want to go;be what you want to be,because " +
                "you have only one life and one chance to do all the things you want to do.";
        HashMap<Character,Integer> data = new HashMap<Character, Integer>();


        for (int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if (data.containsKey(ch))
            {
              //如果已经存在，则从中拿出当前存在的个数
                int count= data.get(ch);
                  count++;
                data.put(ch,count);
            }
            else
            {
                data.put(ch,1);  //如果不存在，则设置ch出现1次
            }
        }

        Set<Character> keySet = data.keySet();   //keySet()返回所有的键  ； values()返回所有的值
        for (char ch:keySet)
        {
            int count = data.get(ch);
            System.out.println(ch+"出现了"+count+"次");
        }
    }
}
