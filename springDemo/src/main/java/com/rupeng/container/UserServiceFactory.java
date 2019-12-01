package com.rupeng.container;

/**
 * @author: chenjiaheng
 * @date ：2019-12-01 11:51
 * @description:
 * @modified By：
 **/
public class UserServiceFactory
{
        public  UserService createUserService()
        {
            return  new UserService();
        }
}
