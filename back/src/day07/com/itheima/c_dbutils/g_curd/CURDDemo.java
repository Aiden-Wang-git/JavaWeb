package day07.com.itheima.c_dbutils.g_curd;

import com.mchange.v2.c3p0.DataSources;
import com.sun.org.apache.bcel.internal.generic.NEW;
import itheima.domain.Category;
import itheima.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.*;
import org.junit.Test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class CURDDemo {
    @Test
    public void inset() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(DataSourceUtils.getDataSources());
        String sql ="insert into category values(?,?);";
        queryRunner.update(sql,"c098","电视机");
    }
    @Test
    public void look() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(DataSourceUtils.getDataSources());
        String sql = "select * from category;";
        List<Category> query = queryRunner.query(sql, new BeanListHandler<>(Category.class));
        for (Category object:query) {
            System.out.println(object);
        }
    }
    @Test
    public void mapListHandler() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(DataSourceUtils.getDataSources());
        String sql = "select * from category;";
        List<Map<String, Object>> query = queryRunner.query(sql, new MapListHandler());
        for (Map<String, Object> object:query) {
            System.out.println(object);
        }
    }
}
