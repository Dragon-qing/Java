package demo03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 修改数据
 */
public class demo03 {
    public static void main(String[] args) {
        Connection conn=null;
        Statement stmt=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String sql="update account set balance=1000 where id=3";
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC","root","123456");
            stmt=conn.createStatement();
            int count=stmt.executeUpdate(sql);
            if(count>0){
                System.out.println("update succeed!");
            }else{
                System.out.println("update fail");
            }

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
