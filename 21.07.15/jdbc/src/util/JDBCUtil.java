package util;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

/**
 * @author wmx
 * @version 0.1
 */
public class JDBCUtil {
    private static String url;
    private static String user;
    private static String password;
    private static String driver;

    static{
        //读取资源文件
        try{
            //创建Properties对象
            Properties pro=new Properties();
            //获取src文件下的资源
            ClassLoader classLoader = JDBCUtil.class.getClassLoader();
            URL resource = classLoader.getResource("jdbc.properties");
            String path = resource.getPath();
            pro.load(new FileReader(path));
            //读取对应的值
            url=pro.getProperty("url");
            user=pro.getProperty("user");
            password=pro.getProperty("password");
            driver=pro.getProperty("driver");
            //注册驱动
            Class.forName(driver);
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

    }

    /**
     * 注册连接
     * @return
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }

    /**
     * 释放资源
     * @param conn
     * @param stmt
     */
    public static void close(Connection conn,Statement stmt){
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

    /**
     * 释放资源
     * @param conn
     * @param stmt
     * @param rs
     */
    public static void close(Connection conn, Statement stmt, ResultSet rs){
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
