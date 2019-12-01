package com.rupeng.mapper;

import com.rupeng.pojo.User;

import java.util.List;

/**
 * @author: chenjiaheng
 * @date ：2019-11-25 19:59
 * @description:
 * @modified By：
 **/
public interface UserMapper
{
    List<User> selectAll();

    User getUserById(long id );

    int insert(User user);

    int insert2(String name);


    int update(User user);

    void delete(long id);


    User select2(User user);
}
