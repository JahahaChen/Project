package com.rupeng.test;

import com.rupeng.AdminUser;
import com.rupeng.dao.AdminUserDao;
import com.rupeng.utils.JdbcUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.Properties;

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
        //System.out.println(addAdminuser());


        //queryAdminUser();

        //getAdminUserById(22);

        //getAdminUserByPhoneNum("18621816254");

//        deleteAdminUser(22);
//        getAdminUserById(22);



    }



    /**
     * 新增用户
     * @return
     */
    public  static  long addAdminuser()
    {
        AdminUser adminUser = new AdminUser();
        adminUser.setName("lll");
        adminUser.setPhoneNum("18621816254");
        adminUser.setEmail("524931024@qq.com");
        adminUser.setPasswordHash("123456*");

        //执行新增操作
        AdminUserDao dao = new AdminUserDao();
       return   dao.addAdminUser(adminUser.getName(),adminUser.getPhoneNum()
               ,adminUser.getPasswordHash(),adminUser.getEmail());

    }

    /**
     * 查询用户信息
     */
    public static  void queryAdminUser()
    {
        AdminUserDao dao = new AdminUserDao();
        AdminUser[] adminUsers= dao.getAll();
        if (adminUsers!=null&&adminUsers.length>0)
        {
            for (int i=0;i<adminUsers.length;i++)
            {
                System.out.println("ID:"+adminUsers[i].getId()+","+
                                    "Name:"+adminUsers[i].getName()+","+
                                    "PhoneNum:"+adminUsers[i].getPhoneNum()+","+
                                    "Email:"+adminUsers[i].getEmail()+","+
                                    "CreateDateTime:"+adminUsers[i].getCreateDateTime()+","+
                                    "PasswordHash:"+adminUsers[i].getPasswordHash());
            }
        }
    }

    /**
     * 编辑用户信息
     * @param id
     */
    public  static  void editAdminUser(AdminUser adminUser)
    {
        AdminUserDao dao  =new AdminUserDao();
        dao.updateAdminUser(adminUser.getId(),adminUser.getName(),
                adminUser.getPasswordHash(),adminUser.getEmail());
    }

    /**
     * 根据id获取对象
     */
    public static  void getAdminUserById(long id)
    {
        AdminUserDao dao = new AdminUserDao();
        AdminUser model= dao.getUserById(id);
        if (model!=null)
        {
            System.out.println("ID:"+model.getId()+","+
                    "Name:"+model.getName()+","+
                    "PhoneNum:"+model.getPhoneNum()+","+
                    "Email:"+model.getEmail()+","+
                    "CreateDateTime:"+model.getCreateDateTime()+","+
                    "PasswordHash:"+model.getPasswordHash());
        }
    }

    /**
     * 根据手机号获取用户信息
     * @param phoneNum
     */
    public  static  void getAdminUserByPhoneNum(String phoneNum)
    {
        AdminUserDao dao = new AdminUserDao();
        AdminUser model= dao.getAdminuserByPhone(phoneNum);
        if (model!=null)
        {
            System.out.println("ID:"+model.getId()+","+
                    "Name:"+model.getName()+","+
                    "PhoneNum:"+model.getPhoneNum()+","+
                    "Email:"+model.getEmail()+","+
                    "CreateDateTime:"+model.getCreateDateTime()+","+
                    "PasswordHash:"+model.getPasswordHash());
        }
    }

    /**
     * 删除用户
     * @param id
     */
    public  static  void deleteAdminUser(long id)
    {
        AdminUserDao dao =new AdminUserDao();
        dao.markDeleted(id);
    }

    @Before
    public void setUp() throws Exception
    {
    }

    @After
    public void tearDown() throws Exception
    {
    }

    @Test
    public void add1()
    {

    }
}
