package com.itheima.UserDaos;

import com.itheima.domain.User;
import com.itheima.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class UserDao {
    public User getUserByUsernameAndPassword(String username, String password) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(DataSourceUtils.getDataSource());
        String sql = "select * from user where username=? and password=?;";
        User user = queryRunner.query(sql, new BeanHandler<>(User.class), username, password);
        return user;
    }
}
