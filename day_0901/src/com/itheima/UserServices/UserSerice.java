package com.itheima.UserServices;

import com.itheima.UserDaos.UserDao;
import com.itheima.domain.User;

import java.sql.SQLException;

/**
 *  @author: WangJun
 *  @Date: 2020/7/22 18:01
 *  @Description:
 */ 
public class UserSerice {
    public User login(String username,String password) throws SQLException {
        /**
        * @Description
        * @Author  WangJun
        * @Date   2020/7/22 18:01
        * @Param  [username, password]
        * @Return com.itheima.domain.User
        * @Exception
        */
        UserDao userDao = new UserDao();
        return userDao.getUserByUsernameAndPassword(username,password);
    }
}
