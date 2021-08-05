package jdbcDemo;

import util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo01 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;
        try {
            conn = JDBCUtils.getConnection();
            conn.setAutoCommit(false);
            String sql1 = "update account set balance =balance-? where id=?";
            String sql2 = "update account set balance =balance+? where id=?";

            pstmt1 = conn.prepareStatement(sql1);
            pstmt2 = conn.prepareStatement(sql2);
            pstmt1.setDouble(1,500);
            pstmt2.setDouble(1,500);
            pstmt1.setInt(2,1);
            pstmt2.setInt(2,2);
            pstmt1.executeUpdate();
            int i=4/0;
            pstmt2.executeUpdate();
            conn.commit();
            System.out.println("修改完成");
        } catch (Exception e) {
            try {
                conn.rollback();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            JDBCUtils.close(conn, pstmt1);
            JDBCUtils.close(null, pstmt2);
        }
    }
}
