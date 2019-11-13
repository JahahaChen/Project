package com.rupeng.test;

import com.rupeng.AdminUser;
import com.rupeng.dao.AdminUserDao;

/**
 * @author: chenjiaheng
 * @date ：2019-11-13 17:32
 * @description: AdminUser Test
 * @modified By：
 **/
public class AdminUserTest
{
    public static void main(String[] args)
    {
        addAdminuser();

    }

    public  static  long addAdminuser()
    {
        AdminUser adminUser = new AdminUser();
        adminUser.setName("cjh");
        adminUser.setPhoneNum("18621816254");
        adminUser.setEmail("524931024@qq.com");
        adminUser.setPasswordHash("Wj524931*");

        //执行新增操作
        AdminUserDao dao = new AdminUserDao();
       return   dao.addAdminUser(adminUser.getName(),adminUser.getPhoneNum()
               ,adminUser.getPasswordHash(),adminUser.getEmail());

    }
}
