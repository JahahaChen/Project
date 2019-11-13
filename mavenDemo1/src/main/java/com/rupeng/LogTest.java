package com.rupeng;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author: chenjiaheng
 * @date ：2019-11-13 09:07
 * @description: operation log
 * @modified By：
 **/
public class LogTest {
    private static Logger logger   = LogManager.getLogger(LogTest.class);

    public static void main(String[] args) {
          logger.info("测试");
          logger.error("报错了");
          logger.debug("hello {} {} ","yes","integer.valueOf(5)");
    }
}
