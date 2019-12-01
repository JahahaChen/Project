package com.rupeng;

import java.io.*;
import java.util.HashMap;

/**
 * @author: chenjiaheng
 * @date ：2019-11-23 11:27
 * @description:
 * @modified By：
 **/
public class JianToZhuanFanTi
{

    private HashMap<Character,Character> data = new HashMap<Character, Character>();

    public JianToZhuanFanTi() throws IOException
    {
        FileInputStream fis = null;
        InputStreamReader reader=null;
        BufferedReader bf = null;

        try
        {
            fis = new FileInputStream("");
            reader =new InputStreamReader(fis,"UTF-8");
            bf = new BufferedReader(reader);
            String line;
            while ((line=bf.readLine())!=null)
            {
                char chJianTi = line.charAt(0);
                char chFanTi = line.charAt(1);
                data.put(chJianTi,chFanTi);  //简体为key  繁体为value 填充简繁体对照表
            }
        }
        finally
        {
            closeQuietly(bf);
            closeQuietly(reader);
            closeQuietly(fis);
        }
    }

    //关闭
    static  void closeQuietly(Closeable c)
    {
        if (c!=null)
        {
            try
            {
                c.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

        }
    }


    /**
     * 简体转换为繁体
     * @param s
     * @return
     */
    public  String convert(String s)
    {
        StringBuilder sb = new StringBuilder();
       for (int i=0;i<s.length();i++)
       {
          char ch = s.charAt(i);
          if (data.containsKey(ch))
          {
              char fan = data.get(ch);
              sb.append(fan);
          }
          else
          {
              sb.append(ch);  // 如果不存在，则这个字符不转换
          }
       }
       return sb.toString();
    }
}
