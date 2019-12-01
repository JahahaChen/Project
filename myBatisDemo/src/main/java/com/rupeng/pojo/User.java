package com.rupeng.pojo;

import java.util.Objects;

/**
 * @author: chenjiaheng
 * @date ：2019-11-25 19:53
 * @description:
 * @modified By：
 **/
public class User
{
    private  Long id;
    private  String name;
    private  int age;

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        User user = (User) o;
        return age == user.age &&
                id.equals(user.id) &&
                name.equals(user.name);
    }



    @Override
    public String toString()
    {
        return "User" +
                "id=" + id +
                ", name=" + name + '\'' +
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
