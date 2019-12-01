package com.rupeng.pojo;

/**
 * @author: chenjiaheng
 * @date ：2019-11-27 18:57
 * @description:
 * @modified By：
 **/
public class User
{
    private  Long id;
    private  String name;
    private  int age;

    @Override
    public String toString()
    {
        return "User" +
                "id=" + id +
                ", name=" + name+
                ", age=" + age ;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
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
}
