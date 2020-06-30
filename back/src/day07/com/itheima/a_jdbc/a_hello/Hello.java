package day07.com.itheima.a_jdbc.a_hello;
/**
 *  @author: WangJun
 *  @Date: 2020/6/29 21:00
 *  @Description:
 */ 
import day07.com.itheima.utils.jdbcUtils;
import org.junit.Test;

import java.sql.*;

public class Hello {
    @Test
    public void f1(){
        System.out.println("test");
    }
    @Test
    public void f2() throws Exception {
        Connection connection = jdbcUtils.getConnection();
        String sql = "select * from category;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println("id:"+resultSet.getString(1)+",name"+resultSet.getString(2));
        }
        jdbcUtils.closeResource(connection,resultSet,preparedStatement);
    }
    @Test
    public void f3() throws SQLException, ClassNotFoundException {
        Connection connection =jdbcUtils.getConnection();
        String sql = "insert into category values(?,?);";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,"c005");
        preparedStatement.setString(2,"户外");
        int num = preparedStatement.executeUpdate();
        System.out.println(num);
        jdbcUtils.closeResource(connection,null,preparedStatement);
    }
}
