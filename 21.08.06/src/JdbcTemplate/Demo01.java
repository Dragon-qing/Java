package JdbcTemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import utils.JDBCUtils;

public class Demo01 {
    public static void main(String[] args) {
        JdbcTemplate template=new JdbcTemplate(JDBCUtils.getDataSource());
        //调用方法
        String sql="update account set balance = 5000 where id=?";
        int count=template.update(sql,4);
        System.out.println(count);
    }
}
