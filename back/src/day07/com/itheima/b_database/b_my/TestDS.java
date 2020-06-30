package day07.com.itheima.b_database.b_my;

import java.sql.Connection;
import java.sql.SQLException;

public class TestDS {
    public static void main(String[] args) throws SQLException {
        MyDataSource myDataSource = new MyDataSource();
        Connection connection =myDataSource.getConnection();
        System.out.println(connection);
        MyDataSource.closeConnection(connection);
    }
}
