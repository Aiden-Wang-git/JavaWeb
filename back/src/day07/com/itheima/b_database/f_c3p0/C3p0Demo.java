package day07.com.itheima.b_database.f_c3p0;

import day07.com.itheima.utils.jdbcUtils;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class C3p0Demo {
    @Test
    public void f1() throws Exception {
        ComboPooledDataSource source = new ComboPooledDataSource();
        source.setDriverClass("com.mysql.cj.jdbc.Driver");
        source.setJdbcUrl("jdbc:mysql://localhost:3306/day07?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai");
        source.setUser("root");
        source.setPassword("123456");
        Connection conn = source.getConnection();
        String sql = "insert into category values(?,?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,"c015");
        ps.setString(2,"电脑");
        int i = ps.executeUpdate();
        System.out.println(i);
        jdbcUtils.closeResource(conn,null,ps);
    }
    @Test
    public void f2() throws Exception{
        ComboPooledDataSource source = new ComboPooledDataSource();
        Connection conn = source.getConnection();
        String sql = "insert into category values(?,?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,"c018");
        ps.setString(2,"可乐");
        int i = ps.executeUpdate();
        System.out.println(i);
        jdbcUtils.closeResource(conn,null,ps);
    }
}
