package com.rupeng;


/**
 * @author: chenjiaheng
 * @date ：2019-11-21 19:17
 * @description: Person
 * @modified By：
 **/
public class Person
{
    private  String name;
    private  int age;
    private  String phoneNum;

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


    /**
     * 内容的比较
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj)
    {
        //判断this是否和objk内容完全一样
        //return super.equals(obj);
        if (!(obj instanceof Person))  //如果被比较的都不是Person，就不相等
        {
            return  false;
        }
        Person pObj = (Person)obj;
        return  this.name.equals(pObj.name)&&this.age==pObj.age&&
                this.phoneNum.equals(pObj.phoneNum);
    }
}
