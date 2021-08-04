package demo05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 穿建一个表
 */

public class demo05 {
    public static void main(String[] args) {
        Connection conn=null;
        Statement stmt=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String sql="create table student (id int primary key,name varchar(20) not null)";
            conn= DriverManager.getConnection("jdbc:mysql:///test?useSSL=false&serverTimezone=UTC","root","root");
            stmt=conn.createStatement();
            int i = stmt.executeUpdate(sql);
            System.out.println(i);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            if(stmt!=null){
                try {
                    stmt.close();
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

