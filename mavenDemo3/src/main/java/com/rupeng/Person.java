package com.rupeng;


/**
 * @author: chenjiaheng
 * @date ：2019-11-23 14:26
 * @description: Person
 * @modified By：
 **/
public class Person
{
    private  String name;
    private  int age;
    private  String phoneNum;

    public  int haahha;

    public  Person()
    {
        this.name="无名氏";
        this.age=19;
        this.phoneNum="110";
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getPhoneNum()
    {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum)
    {
        this.phoneNum = phoneNum;
    }

    public  void sayHello()
    {
   System.out.println(toString());
    }


    @Override
    public String toString()
    {
        return "name=" + name + '|' +
                "age=" + age +'|' +
                "phoneNum=" + phoneNum  ;
    }

    @Override
    public boolean equals(Object o)
    {
       if (!(o instanceof  Person))
       {
           return  false;
       }
       Person pObj = (Person)o;
       return  this.name.equals(pObj.name)&&this.age==pObj.age
               &&this.phoneNum.equals(pObj.phoneNum);
    }

    @Override
    public int hashCode()
    {
        String s = this.name +this.age+this.phoneNum;
        return  s.hashCode();
    }

    public  int compareTo(Person p)
    {
        return  p.getName().length()-this.getName().length();
    }
}
