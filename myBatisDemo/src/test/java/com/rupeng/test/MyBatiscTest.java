package com.rupeng.test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mysql.cj.xdevapi.SessionFactory;
import com.rupeng.mapper.AnswersMapper;
import com.rupeng.mapper.QuestionsMapper;
import com.rupeng.mapper.UserMapper;
import com.rupeng.pojo.Answers;
import com.rupeng.pojo.Questions;
import com.rupeng.pojo.User;
import com.sun.corba.se.spi.servicecontext.UEInfoServiceContext;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.sql.SQLSyntaxErrorException;
import java.util.List;

/**
 * @author: chenjiaheng
 * @date ：2019-11-26 19:58
 * @description:
 * @modified By：
 **/
public class MyBatiscTest
{
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public  void  init()
    {
        //加载资源文件，并创建SqlSessionFactory
        InputStream inputStream =MyBatiscTest.class.getResourceAsStream("/mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
    }
    //

    @Test
    public  void  test1(){
        //打开和数据库的Session
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //获得Mapper接口的对象
        //自动创建UserMapper 的代理类 UserMapper.class
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.selectAll();
        User getUserById = userMapper.getUserById(2);
        System.out.println(userList);
        System.out.println(getUserById);
        sqlSession.close();
    }


    @Test
    public  void testInsert()
    {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User user = new User();
        user.setAge(19);
        user.setName("cjh");
        long userId = userMapper.insert(user);


//        long userId = userMapper.insert2("insert2Name");

        System.out.println(userId);


        sqlSession.commit();  // 事务的commit
        sqlSession.close();

    }



    @Test
    public  void  testUpdate()
    {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user    = new User();
        user.setName("updateName");
        user.setAge(29);
        user.setId(19L);

        int result = userMapper.update(user);

        System.out.println(result);
        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public  void testDelete()
    {
        SqlSession sqlSession  =  sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        userMapper.delete(20L);

        System.out.println("ok");
        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public  void testSelectAnswers()
    {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AnswersMapper answersMapper = sqlSession.getMapper(AnswersMapper.class);

        Answers answers= answersMapper.selectById(2);

        System.out.println(answers);
        sqlSession.close();

    }

    @Test
    public  void   testselectQuestionsById()
    {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        QuestionsMapper questionsMapper = sqlSession.getMapper(QuestionsMapper.class);

        Questions questions = questionsMapper.selectById(1);
        System.out.println(questions);
        sqlSession.close();
    }


    @Test
    public  void testSelectUser()
    {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper= sqlSession.getMapper(UserMapper.class);

        User user = new User();
        user.setId(2L);

        User select= userMapper.select2(user);
        System.out.println(select);

        sqlSession.close();
    }


    @Test
    public  void  testPageUser(){
        //打开和数据库的Session
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //获得Mapper接口的对象
        //自动创建UserMapper 的代理类 UserMapper.class
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        PageHelper.startPage(2,10);
        PageHelper.orderBy("age desc");



        List<User> userList = userMapper.selectAll();

        PageInfo<User> pageInfo = new PageInfo<User>(userList);
        System.out.println(pageInfo.getList());

        System.out.println("=================================");

        sqlSession.close();
    }

    @Test
    public  void  testCache1()
    {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        List<User> userList = userMapper.selectAll();

        System.out.println(userList);
        System.out.println("---------------------------");
        User user   = new User();
        user.setAge(11);
        user.setName("cjh1");
        int insertUser= userMapper.insert(user);
        System.out.println(insertUser);
        userList= userMapper.selectAll();
        System.out.println(userList);

        sqlSession.close();
    }






}
