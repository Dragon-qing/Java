package demo01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class demo01 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC", "root", "123456");
        String sql="update account set balance =255 ";
        Statement statement = conn.createStatement();
        int count = statement.executeUpdate(sql);
        System.out.println(count);
        statement.close();
        conn.close();
    }
}
