package itheima.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataSourceUtils {
    private static ComboPooledDataSource cpds = new ComboPooledDataSource();
    /**
    * @Description 获取数据
    * @Author  WangJun
    * @Date   2020/6/30 16:26
    * @Param
     * @param
    * @Return null 连接池
    * @Exception
    */
    public static ComboPooledDataSource getDataSources(){
        return cpds;
    }
    /**
    * @Description 获取连接
    * @Author  WangJun
    * @Date   2020/6/30 16:28
    * @Param
     * @param
    * @Return null
    * @Exception
    */
    public static Connection getConnection() throws SQLException {
        return cpds.getConnection();
    }
    /**
    * @Description 释放资源
    * @Author  WangJun
    * @Date   2020/6/30 16:30
    * @Param
     * @param
    * @Return null
    * @Exception
    */
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
