package com.rupeng;

/**
 * @author: chenjiaheng
 * @date ：2019-11-23 14:37
 * @description:
 * @modified By：
 **/
public class FanSheTest1
{
    public static void main(String[] args)
    {
        //定义一个Class类型的变量，指向Person类的描述对象
        Class clz1 = Person.class;  //获取Person类对应的Class类的对象

        Person p1 = new Person();
        Class clz2 = p1.getClass() ;  // 根据类的对象，获取类的描述对象

        //如果只知道类的包名、类名
        Class clz3;
        try
        {
           clz3= Class.forName("com.rupeng.Person");
        }
        catch (ClassNotFoundException f)
        {
           throw  new RuntimeException(f);
        }

        System.out.println(clz1);
        System.out.println(clz2);
        System.out.println(clz3);


        //Java中== 表示这两个变量指向的对象是不是同一个对象
        //clz1 clz2 clz3拿到的都是同一个Class类对象
        System.out.println(clz1==clz2);
        System.out.println(clz2==clz3);

    }
}
