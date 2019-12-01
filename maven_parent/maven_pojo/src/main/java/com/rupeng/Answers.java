package com.rupeng;

/**
 * @author: chenjiaheng
 * @date ：2019-12-01 12:40
 * @description:
 * @modified By：
 **/
public class Answers
{
    private  long id;
    private  String content;
    private  Questions question;//has-a

    @Override
    public String toString()
    {
        return "Answers{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", question=" + question +
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

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    public Questions getQuestion()
    {
        return question;
    }

    public void setQuestion(Questions question)
    {
        this.question = question;
    }
}
