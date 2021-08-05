package login;

import com.mysql.cj.log.Log;
import util.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();
        if(new Login().login2(name,password)){
            System.out.println("登录成功！！！");
        }else{
            System.out.println("登录失败！！！");
        }

    }
    public boolean login2(String user,String password){
        if(user==null||password==null){
            return false;
        }
        Connection conn=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        try {
            conn = JDBCUtils.getConnection();
            String sql="select * from user where userId=? and password=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,user);
            pstmt.setString(2,password);
            //注意不能传参！！！
            rs = pstmt.executeQuery();
            return rs.next();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JDBCUtils.close(conn,pstmt,rs);
        }
        return false;
    }
    public boolean login(String user,String password){
        if(user==null||password==null){
            return false;
        }
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        try {
            conn = JDBCUtils.getConnection();
            String sql="select * from user where userId='"+user+"' and password='"+password+"'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            return rs.next();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JDBCUtils.close(conn,stmt,rs);
        }
        return false;
    }
}
