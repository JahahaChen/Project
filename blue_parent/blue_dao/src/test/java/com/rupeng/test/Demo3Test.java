package com.rupeng.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Demo3Test
{

    //再测试方法执行之前执行
    @Before
    public void setUp() throws Exception
    {
    }

    //再测试方法执行之后执行
    @After
    public void tearDown() throws Exception
    {
    }

    @Test
    public void add()
    {
        Demo3 demo= new Demo3();
        assertEquals(5,demo.add(3,1));
    }
}