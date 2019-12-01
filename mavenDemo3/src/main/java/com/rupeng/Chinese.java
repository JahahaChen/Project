package com.rupeng;


/**
 * @author: chenjiaheng
 * @date ：2019-11-23 15:37
 * @description:
 * @modified By：
 **/
public class Chinese extends Person
{
    private  int age = 5;
    public  int count = 33;

    public  Chinese()
    {

    }

   public  Chinese(int age,String name)
   {
       this.setAge(age);
       setName(name);
   }
   public  Chinese(String name)
   {
       setName(name);
   }
   public  void  hello()
   {
       System.out.println("hello");
   }

   private  void  eat()
   {
       System.out.println("eat");
   }


   public  void speak(String s)
   {
       System.out.println("speak "+s);
   }

}
