package demo02;

import util.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbc_demo02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name=sc.next();
        System.out.println("请输入密码：");
        String password=sc.next();
        boolean flag=false;
        flag=new jdbc_demo02().login(name,password);
        if(flag){
            System.out.println("登录成功！！");
        }else{
            System.out.println("登录失败！！！！");
        }
    }
    public boolean login(String name,String password){
        if(name==null||password==null){
            return false;
        }
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;

        try {
            conn= JDBCUtils.getConnection();
            String sql="select * from user where userId ='"+name+"' and password='"+password+"'";
            stmt=conn.createStatement();
            rs = stmt.executeQuery(sql);
            return rs.next();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }   finally {
            JDBCUtils.close(conn,stmt,rs);
        }

        return true;
    }
}
