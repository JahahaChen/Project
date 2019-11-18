package com.rupeng;


import sun.util.locale.LocaleSyntaxException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenjiaheng
 * @date ：2019-11-14 13:47
 * @description: List Test
 * @modified By：
 **/
public class ListTest
{
    public static void main(String[] args)
    {
        /*
         *写一个方法，返回一个int数组中所有能被3整除的数
        //数组的长度是声明后固定的，
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(55);
        myArrayList.add(66);
        myArrayList.add(99);
        myArrayList.add(109);
        myArrayList.add(103);
        myArrayList.add(234);
        myArrayList.add(463);
        myArrayList.add(39);

        for (int i=0;i<myArrayList.size();i++)
        {
            Object object = myArrayList.get(i);
            int num = Integer.parseInt(String.valueOf(object));
            if (num%3==0)
            {
              System.out.println(num);
            }
        }
      */

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);


         //集合的三种遍历方式;
         //1、 for (int i =0;i<list.size();i++)
         //最基础的遍历方式：for循环，指定下标长度，使用List集合的size()方法，进行for循环遍历
         //但是需要注意的是，在删除集合的元素时，会出现删不掉的问题 (顺序删不掉)，倒序删可以删干净
         //为什么正序删除不干净，还得从ArrayList的集合特点来说


        //2、for(Integer i : list)
        //较为简洁的删除方式，使用foreach遍历list，但不能对某一个元素进行操作(这种方法在遍历数组和Map集合的时候同样使用)

        //3、Iterator<Integer> iter = list.iterator();
        //使用迭代器Iterator遍历，直接根据list集合的自动遍历
        //迭代器删除，可以删干净
        for (int i=list.size()-1;i>=0;i--)
        {
            list.remove(i);
        }

         //使用迭代器删除
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext())
        {
            iter.remove();
        }













    }
}
