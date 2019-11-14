package com.rupeng.dao;

import com.rupeng.AdminUser;
import com.rupeng.utils.CommonUtils;
import com.rupeng.utils.JdbcUtils;
import org.apache.commons.lang3.StringUtils;
import sun.nio.cs.FastCharsetProvider;


import javax.management.relation.RoleUnresolved;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

/**
 * @author: chenjiaheng
 * @date ：2019-11-13 15:14
 * @description: AdminUser Dao
 * @modified By：
 **/
public class AdminUserDao
{
    /**
     * 新增用户
     * @param name
     * @param phoneNum
     * @param password
     * @param email
     * @return
     */
    public long addAdminUser(String name,String phoneNum,String password,String email)
    {
        String hashPassWord = CommonUtils.calcMD5(password);
        StringBuilder sb  = new StringBuilder();
        sb.append("Insert into T_AdminUsers(Name,PhoneNum,PasswordHash,Email,IsDeleted,CreateDateTime)\n");
        sb.append("values(?,?,?,?,0,now())");
        return JdbcUtils.executeInsertAutoInc(sb.toString(),name,phoneNum, hashPassWord,email);
    }


    /**
     * 修改用户信息
     * @param id
     * @param name
     * @param passWord
     * @param email
     */
    public void updateAdminUser(long id,String name ,String passWord,String email)
    {
      if (StringUtils.isEmpty(passWord))
      {
         StringBuilder sb = new StringBuilder();
         sb.append("update T_AdminUsers set Name=?,email=?\n");
         sb.append("where id=?");
         JdbcUtils.executeUpdate(sb.toString(),name,email,id);
      }
      else
      {
          String hashPassword = CommonUtils.calcMD5(passWord);
          StringBuilder sb = new StringBuilder();
          sb.append("update T_AdminUsers set Name =?,PasswordHash=?,email=?\n");
          sb.append("where id=?");
          JdbcUtils.executeUpdate(sb.toString(),name,hashPassword,email,id);
      }
    }


    /**
     * 获取所有的用户
     * @return
     */
    public  AdminUser[] getAll()
    {
        String sql = "select * from T_AdminUsers where isDeleted = 0";
        List<AdminUser> list = new ArrayList<>();
        ResultSet rs = JdbcUtils.executeQuery(sql);
        try{
            while (rs.next()){
              list.add(toAdminUser(rs));
            }
            return  list.toArray(new AdminUser[list.size()]);
        }catch (SQLException ex){
             throw  new RuntimeException(ex);
        }
    }

    /**
     * 根据ID获取实体类
     * @param id
     * @return
     */
    public  AdminUser getUserById(long id)
    {
       ResultSet resultSet   = null;
       try
       {
          resultSet = JdbcUtils.executeQuery("select * from T_AdminUsers  where IsDeleted = 0 and Id=?",id);
          if (resultSet.next()){
               return  toAdminUser(resultSet);
          }else {
              return  null;
          }
       }
       catch (SQLException ex)
       {
           throw new RuntimeException(ex);
       }
    }


    /**
     * 根据手机号获取用户信息
     * @param phoneNum
     * @return
     */
    public AdminUser getAdminuserByPhone(String phoneNum)
    {
        ResultSet resultSet = null;
        try
        {
            resultSet = JdbcUtils.executeQuery("select * from T_AdminUsers where IsDeleted = 0 and PhoneNum = ?  limit  1",phoneNum);
            if (resultSet.next()){
              return toAdminUser(resultSet);
            }
            else
            {
              return  null;
            }
        }catch (SQLException ex)
        {
            throw  new RuntimeException(ex);
        }
    }

    /**
     * 检查用户名密码是否正确
     * @param phoneNum
     * @param password
     * @return
     */
    public  boolean checkLogin(String phoneNum,String password)
    {
       AdminUser adminUser =getAdminuserByPhone(phoneNum);
       if (adminUser==null)
       {
           return false;
       }
       String passWordHash =CommonUtils.calcMD5(password);
       if (adminUser.getPasswordHash().equals(passWordHash))
       {
            return  true;
       }else
       {
           return  false;
       }
    }

    /**
     * 删除
     * @param adminUserId
     */
    public void markDeleted(long adminUserId)
    {
          JdbcUtils.executeUpdate("update T_AdminUsers set IsDeleted= 1 where id=?",adminUserId);
    }



    private static  AdminUser toAdminUser(ResultSet resultSet) throws SQLException
    {
         AdminUser adminUser = new AdminUser();
         adminUser.setCreateDateTime(resultSet.getDate("CreateDateTime"));
         adminUser.setDeleted(resultSet.getBoolean("IsDeleted"));
         adminUser.setEmail(resultSet.getString("Email"));
         adminUser.setId(resultSet.getLong("Id"));
         adminUser.setName(resultSet.getString("Name"));
         adminUser.setPhoneNum(resultSet.getString("PhoneNum"));
         adminUser.setPasswordHash(resultSet.getString("PasswordHash"));
         return  adminUser;
    }




}
