package demo04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 删除一条数据
 */

public class demo04 {
    public static void main(String[] args) {
        Connection conn=null;
        Statement stmt=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String sql="delete from account where id =3";
            conn= DriverManager.getConnection("jdbc:mysql:///test?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true","root","root");
            stmt=conn.createStatement();
            int i = stmt.executeUpdate(sql);
            if(i>0){
                System.out.println("删除成功！");
            }else{
                System.out.println("删除失败！");
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
