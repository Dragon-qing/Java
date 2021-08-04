package JDBC;

import domain.Student;
import util.JDBCUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCDemo01 {
    public static void main(String[] args) {

        List<Student> list=new JDBCDemo01().findAll();
        System.out.println(list);
        System.out.println(list.size());
    }
    public List<Student> findAll(){
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        List<Student> list=new ArrayList<>();
        try {
            conn= JDBCUtil.getConnection();
            String sql="select * from student";
            stmt= conn.createStatement();
            rs=stmt.executeQuery(sql);
            Student s=null;
            while(rs.next()){
                s=new Student();
                s.setStudentId(rs.getString("StudentId"));
                s.setStudentName(rs.getString("StudentName"));
                s.setStudentSex(rs.getString("StudentSex"));
                s.setStudentSchool(rs.getString("StudentSchool"));
                list.add(s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            JDBCUtil.close(conn,stmt,rs);
        }
        return list;
    }
}
