package JDBC;

import util.JDBCUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * 登录方法
 * @author wmx
 * @version 0.1
 */
public class JDBCDemo02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入账户：");
        String name=scan.nextLine();
        System.out.println("请输入密码：");
        String password=scan.nextLine();
        boolean flag=new JDBCDemo02().login(name,password);
        if(flag){
            System.out.println("登录成功");
        }else{
            System.out.println("账户或密码错误");
        }
    }

    /**
     * 登录
     * @param name
     * @param password
     * @return
     */
    public boolean login(String name,String password){
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        try {
            conn= JDBCUtil.getConnection();
            stmt=conn.createStatement();
            String sql="select * from user where userId='"+name+"'and password='"+password+"'";
            rs=stmt.executeQuery(sql);
            return rs.next();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JDBCUtil.close(conn,stmt,rs);
        }
        return false;
    }
}
