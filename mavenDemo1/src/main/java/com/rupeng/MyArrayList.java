package com.rupeng;

/**
 * @author: chenjiaheng
 * @date ：2019-11-14 13:33
 * @description: MyArrayList Test
 * @modified By：
 **/
public class MyArrayList
{
    /**
     * 编写一个可以动态“扩容” 的动态Array：MyArrayList（
     * 必须My，防止冲突）。 思路：初始声明一个长度为5的数
     * 组，然后把数据往这数组中填充，当填满之后，再添加元
     * 素的话，则创建一个新的数组（在原数据的基础上再增加
     * 5个长度），把原数组的内容拷贝到新数组，然后顺着新
     * 增加的部分继续填充
     */
      private  Object[] data;
      private  int currentSize = 0;  //当前填充的数据条数

      public MyArrayList()
      {
          data = new Object[10];
      }

      public  void  add(Object obj)
      {
          if (currentSize>=data.length)
          {
              Object[] newdataList = new Object[data.length+10];  //创建新的更长数组
              for (int i =0;i<data.length;i++)
              {
                newdataList[i]=data[i];
              }
              data = newdataList;
          }
          data[currentSize] =obj;
          currentSize++;
      }

      public  int size()
      {
          return  currentSize;
      }

      public  Object get(int index)
      {
          if (index>currentSize)
          {
              throw  new IllegalArgumentException("超出大小");
          }
          return  data[index];
      }
}
