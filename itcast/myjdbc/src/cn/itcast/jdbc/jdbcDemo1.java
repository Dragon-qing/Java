package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbcDemo1 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123456");
        String sql=""
    }
}
