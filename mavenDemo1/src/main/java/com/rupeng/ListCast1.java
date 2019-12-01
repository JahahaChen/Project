package com.rupeng;

import javax.swing.text.html.HTMLDocument;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: chenjiaheng
 * @date ：2019-11-21 19:18
 * @description: LastCase1
 * @modified By：
 **/
public class ListCast1
{
    public static void main(String[] args)
    {
        try
        {
            List<Person> persons = readAllPersons("D:\\Personal\\JavaDoc\\1.txt");

                System.out.println(persons.size());
                for (Person p:persons)
                {
                    System.out.println("Name:"+p.getName()+";Age:"
                            +p.getAge()+";PhoneNum:"+p.getPhoneNum());
                }


        }catch (IOException e)
        {
           e.printStackTrace();
        }
    }


    static List<Person> readAllPersons(String file) throws IOException
    {
        FileInputStream fileInputStream = null;
        InputStreamReader inputStreamReader=null;
        BufferedReader bufferedReader=null;

        List<Person> list = new ArrayList<Person>();
        try
        {
            fileInputStream = new FileInputStream(file);
            inputStreamReader  =new InputStreamReader(fileInputStream);
            bufferedReader = new BufferedReader(inputStreamReader);

            String line = null;
            while ((line=bufferedReader.readLine())!=null)
            {
                //以空格来分组
               String [] strs = line.split(" ");
               String name = strs[0];
               int age = Integer.parseInt(strs[1]);
               String phoneNum = strs[2];

               Person p   = new Person();
               p.setName(name);
               p.setAge(age);
               p.setPhoneNum(phoneNum);
               list.add(p);
            }
        }
        finally
        {
            closeQuietly(fileInputStream);
            closeQuietly(inputStreamReader);
            closeQuietly(bufferedReader);
        }
        return  list;
    }


    static  void  closeQuietly(Closeable c)
    {
        if (c!=null)
        {
            try
            {
              c.close();
            }catch (IOException ex)
            {
                ex.printStackTrace();
            }
        }
    }
}
