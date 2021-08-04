package demo06;

import java.sql.*;

/**
 * DQL
 */

public class demo06 {
    public static void main(String[] args) {
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String sql="select * from student";
            conn= DriverManager.getConnection("jdbc:mysql:///management?useSSL=false&serverTimezone=UTC","root","root");
            stmt=conn.createStatement();
            rs = stmt.executeQuery(sql);
           while(rs.next()){

            String id =rs.getString (1);
            String name =rs.getString (2);
            String sex=rs.getString(3);
            String school=rs.getString(4);

            System.out.println(id+"---"+name+"----"+sex+"-----"+school);
           }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            if(rs!=null){
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
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

