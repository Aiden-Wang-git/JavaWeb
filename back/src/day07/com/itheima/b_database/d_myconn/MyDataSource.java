package day07.com.itheima.b_database.d_myconn;

import day07.com.itheima.utils.jdbcUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *  @author: WangJun
 *  @Date: 2020/6/30 11:17
 *  @Description: 连接池
 */
public class MyDataSource {
   static   LinkedList<Connection> pool = new LinkedList<>();
    static {
        for (int i=0;i<3;++i){
            try {
                Connection coon = jdbcUtils.getConnection();
                pool.addLast(coon);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public  Connection getConnection(){
        if (pool.isEmpty()){
            for (int i=0;i<2;++i){
                try {
                    Connection coon = jdbcUtils.getConnection();
                    pool.addLast(coon);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("从连接池中获取连接");
        Connection connection = pool.removeFirst();
        return new ConnectionWarp(connection,pool);
    }
    public static void closeConnection(Connection connection) throws SQLException {
        System.out.println("归还连接到连接池");
        pool.addLast(connection);
    }
}
