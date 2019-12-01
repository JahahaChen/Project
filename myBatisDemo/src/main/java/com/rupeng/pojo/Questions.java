package com.rupeng.pojo;

import java.util.List;

/**
 * @author: chenjiaheng
 * @date ：2019-11-30 14:09
 * @description:
 * @modified By：
 **/
public class Questions
{
    private  long id;
    private  String description;
    private  List<Answers> answersList;  //has-many

    @Override
    public String toString()
    {
        return "Questions{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", answersList=" + answersList +
                '}';
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public List<Answers> getAnswersList()
    {
        return answersList;
    }

    public void setAnswersList(List<Answers> answersList)
    {
        this.answersList = answersList;
    }
}
