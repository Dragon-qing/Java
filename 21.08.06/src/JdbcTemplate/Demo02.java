package JdbcTemplate;

import domain.person;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import utils.JDBCUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class Demo02 {
    private JdbcTemplate template=new JdbcTemplate(JDBCUtils.getDataSource());
    @Test
    public void test1(){
        String  sql="update account set balance = 500 where id =1";
        int count = template.update(sql);
        Assert.assertEquals(1,count);
    }
    @Test
    public void test2(){
        String sql="insert into account values(null,?,?)";
        int count = template.update(sql, "吴亦凡", 1500);
        Assert.assertEquals(1,count);
    }
    @Test
    public void test3(){
        String sql="delete from account where id=?";
        int count = template.update(sql, 4);
        Assert.assertEquals(1,count);
    }

    /**
     * 注意此方法只能是查询结果为1个
     */
    @Test
    public void test4(){
        String sql="select * from account where id =?";
        Map<String, Object> map = template.queryForMap(sql, 1);
        System.out.println(map);//{id=1, name=zhangsan, balance=500.0}
    }
    @Test
    public void test5(){
        String sql="select * from account ";
        List<Map<String, Object>> maps = template.queryForList(sql);
        for (Map<String, Object> map : maps) {
            System.out.println(map);
        }

    }

    /**
     * 封装为对象
     */
    @Test
    public void test6(){
        String sql="select * from account";
        List<person> list = template.query(sql, new RowMapper<person>() {

            @Override
            public person mapRow(ResultSet rs, int i) throws SQLException {
                person p = new person();
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double balance = rs.getDouble("balance");
                p.setId(id);
                p.setName(name);
                p.setBalance(balance);
                return p;
            }
        });
        for (person person : list) {
            System.out.println(person);
        }
    }
    @Test
    public void test6_2(){
        String sql="select * from account";
        List<person> list = template.query(sql, new BeanPropertyRowMapper<person>(person.class));
        for (person person : list) {
            System.out.println(person);
        }
    }
    @Test
    public void test7(){
        String sql="select count(id) from account";
        Long total = template.queryForObject(sql, Long.class);
        System.out.println(total);
    }
}
