package day07.com.itheima.b_database.d_myconn;

import java.sql.Connection;
import java.sql.SQLException;

public class TestDS {
    public static void main(String[] args) throws SQLException {
        MyDataSource myDataSource = new MyDataSource();
        Connection connection = myDataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
}
