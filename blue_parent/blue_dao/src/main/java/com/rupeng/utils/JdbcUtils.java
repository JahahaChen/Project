package com.rupeng.utils;


import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author: chenjiaheng
 * @date ：2019-11-13 11:23
 * @description: JDBC  Utils
 * @modified By：
 **/
public class JdbcUtils {
   private  final static   String DB_DRIVE_NAME;
   private  final static  String  DB_URL;
   private  final  static  String DB_USER_NAME;
   private  final  static  String DB_PSSSWORD;

   static{
       try {
           InputStream inputStream = JdbcUtils.class.getClassLoader()
                   .getResourceAsStream("config.properties");
            Properties prop =new Properties();
            prop.load(inputStream); //从流中获取
            inputStream.close();

           DB_DRIVE_NAME = prop.getProperty("driveName");
           DB_URL=prop.getProperty("url");
           DB_USER_NAME=prop.getProperty("username");
           DB_PSSSWORD=prop.getProperty("password");
       }catch (Exception e){
            System.out.println("JdbcUtils初始化异常:"+e);
            throw new RuntimeException();
       }
   }

    /**
     * 执行Update、Delete等语句
     * @param sql
     * @param parameters
     * @return
     */
   public static  int executeUpdate(String sql,Object... parameters)
   {
       try (
               Connection  connection = DriverManager.getConnection(DB_URL,DB_USER_NAME,DB_PSSSWORD);
               PreparedStatement ps =connection.prepareStatement(sql);
            )
       {
          for(int i=0;i<parameters.length;i++){
              ps.setObject(i+1,parameters[i]);
          }
            return  ps.executeUpdate();
       }
       catch (SQLException e)
       {
            throw  new RuntimeException(e);
       }
   }

    /**
     * 执行自增主键的插入语句，返回自增字段的值
     * @param sql
     * @param parameters
     * @return
     */
    public  static  long executeInsertAutoInc(String sql ,Object... parameters){
        try (
                Connection connection = DriverManager.getConnection(DB_URL,DB_USER_NAME,DB_PSSSWORD);
                PreparedStatement ps  = connection.prepareStatement(sql);
             )
        {

            for (int i=0;i<parameters.length;i++){
                ps.setObject(i+1,parameters[i]);
            }
             ps.executeUpdate();

            try(ResultSet rsGk = ps.getGeneratedKeys())
            {
                 if (rsGk.next()==false){
                   throw  new RuntimeException("没有自动生成的主键，有可能是没有设置自增主键");
                 }
              return  rsGk.getLong(1);
            }

        }catch (SQLException ex){
            throw  new RuntimeException(ex);
        }
    }

    /**
     * 执行查询语句
     * @param sql
     * @param paramters
     * @return
     */
   public  static ResultSet executeQuery(String sql ,Object... paramters){
      try(
              Connection connection  = DriverManager.getConnection(DB_URL,DB_USER_NAME,DB_PSSSWORD);
              PreparedStatement ps  = connection.prepareStatement(sql);
         )
      {
         for(int i=0;i<paramters.length;i++){
          ps.setObject(i+1,paramters[i]);
         }
         try(ResultSet rs  = ps.executeQuery();)
         {
             RowSetFactory rsf  = RowSetProvider.newFactory();
             CachedRowSet cachedRowSet = rsf.createCachedRowSet();
             cachedRowSet.populate(rs);
             return cachedRowSet;
         }

      }catch (SQLException ex){
          throw  new RuntimeException(ex);
      }
   }


   public  static Connection GetConnection(){
       Connection connection = null;
       try {
            connection = DriverManager.getConnection(DB_URL,DB_USER_NAME,DB_PSSSWORD);
       }catch (SQLException ex){
           throw  new RuntimeException(ex);
       }
       return  connection;
   }

    /**
     *
     * @param connection
     * @param sql
     * @param parameters
     * @return
     */
   public static  int execupteUpdate(Connection connection ,String sql,Object... parameters)
   {

        try (PreparedStatement ps = connection.prepareStatement(sql))
        {
            for(int i=0;i<parameters.length;i++)
            {
               ps.setObject(i+1,parameters[i]);
            }
            return ps.executeUpdate();
        }catch (SQLException ex)
        {
            throw  new RuntimeException(ex);
        }
   }


   public  static void rollBack(Connection connection)
   {
       try
       {
          connection.rollback();
       }catch (SQLException ex)
       {
           throw  new RuntimeException(ex);
       }
   }


    /**
     * 执行查询，并且返回结果集中的首行首列的值，如果没有值，则返回Null  select count(*) from t
     * @param sql
     * @param params
     * @return
     * @throws SQLException
     */
    public  static Object querySingle(String sql ,Object...params) throws SQLException{
        try
           (
            Connection connection = DriverManager.getConnection(DB_URL,DB_USER_NAME,DB_PSSSWORD);
            PreparedStatement ps = connection.prepareStatement(sql);
           ){
             for (int i=0;i<params.length;i++){
                 ps.setObject(i+1,params[i]);
             }
             ResultSet rs = ps.executeQuery();
             if (rs.next()){
                 return rs.getObject(1);
             }
             else{
                 return  null;
             }
        }catch (SQLException ex){
            throw new RuntimeException(ex);
        }
    }



}
