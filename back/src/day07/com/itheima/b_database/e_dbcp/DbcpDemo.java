package day07.com.itheima.b_database.e_dbcp;

import day07.com.itheima.utils.jdbcUtils;
import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.ResourceBundle;

public class DbcpDemo {
    private ResourceBundle resourceBundle = ResourceBundle.getBundle("jdbc");
    @Test
    public void f1() throws SQLException {
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName(resourceBundle.getString("driverClassName"));
        basicDataSource.setUrl(resourceBundle.getString("url"));
        basicDataSource.setUsername(resourceBundle.getString("username"));
        basicDataSource.setPassword(resourceBundle.getString("password"));
        Connection conn = basicDataSource.getConnection();
        String sql = "insert into category values(?,?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,"c011");
        ps.setString(2,"书本");
        int i = ps.executeUpdate();
        System.out.println(i);
        jdbcUtils.closeResource(conn,null,ps);
    }
    @Test
    public void f2() throws Exception {
        Properties properties = new Properties();
        properties.load(new FileReader("src/jdbc.properties"));
        DataSource dataSource = BasicDataSourceFactory.createDataSource(properties);
        Connection conn = dataSource.getConnection();
        String sql = "insert into category values(?,?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,"c012");
        ps.setString(2,"手机");
        int i = ps.executeUpdate();
        System.out.println(i);
        jdbcUtils.closeResource(conn,null,ps);
    }
}
