package com.rupeng;

/**
 * @author: chenjiaheng
 * @date ：2019-11-23 15:25
 * @description:
 * @modified By：
 **/
public class FanSheTest3
{
    public static void main(String[] args)
    {
        Person p1 = new Person();
        String s1 = "hello";
        Integer i1 = 5;

        Class clzPerson = Person.class;
        Class clzString = String.class;
        Class clzComparable = Comparable.class;

        //isInstance判断给定的对象obj是否是当前类类型的（可以是当前类的子类的对象）
        System.out.println(clzPerson.isInstance(p1));
        System.out.println(clzString.isInstance(s1));
        System.out.println(clzComparable.isInstance(i1));
    }
}
