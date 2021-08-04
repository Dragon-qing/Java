package demo02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class demo02 {
    public static void main(String[] args) {
        Connection conn=null;
        Statement statement=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String sql="insert into account values(null,'王五',3999)";
            conn = DriverManager.getConnection("jdbc:mysql:///test?useSSL=false&serverTimezone=UTC", "root", "123456");
            statement = conn.createStatement();
            int i=statement.executeUpdate(sql);
            System.out.println(i);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

        }

    }
}
