package com.rupeng;


import java.util.ArrayList;

/**
 * @author: chenjiaheng
 * @date ：2019-11-23 10:06
 * @description:
 * @modified By：
 **/
public class ListCast2
{
    public static void main(String[] args)
    {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("ab");
        list1.add("rupeng");
        list1.add("tomjson");
        list1.add("baidu");
        list1.add("a");
        list1.add("tencet");
        list1.add("albaba");
        list1.add("jd");
        list1.add("helloworld");

        /*
        for (int i=0;i<list1.size();i++)
        {
            String s= list1.get(i);
            if (s.length()>5)
            {
                list1.remove(i);
            }
        }*/

        /*
        for (int i=list1.size()-1;i>=0;i--)
        {
            String s= list1.get(i);
            if (s.length()>5)
            {
                list1.remove(i);
            }
        }*/


        for (String s:list1)
        {
            System.out.println(s);
        }
    }
}
