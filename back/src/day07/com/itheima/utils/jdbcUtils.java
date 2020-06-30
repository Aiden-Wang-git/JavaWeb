package day07.com.itheima.utils;

import java.sql.*;
import java.util.ResourceBundle;

/**
 *  @author: WangJun
 *  @Date: 2020/6/29 21:00
 *  @Description:
 */ 
public class jdbcUtils {
    /**
    * @Description
    * @Author  WangJun
    * @Date   2020/6/29 21:04
    * @Param  
    * @Return      
    * @Exception   
    */
    public static  Connection getConnection() throws ClassNotFoundException, SQLException {
        ResourceBundle resource = ResourceBundle.getBundle("jdbc");
        Class.forName(resource.getString("driverClass"));
        Connection connection = DriverManager.getConnection(resource.getString("url"),resource.getString("user"),resource.getString("password"));
        return connection;
    }
    
    public static void closeResource(Connection connection, ResultSet resultSet, PreparedStatement preparedStatement) throws SQLException {
        if (resultSet!=null){
            resultSet.close();
        }
        if (preparedStatement!=null){
            preparedStatement.close();
        }
        if (connection!=null){
            connection.close();
        }
    }

    
}
