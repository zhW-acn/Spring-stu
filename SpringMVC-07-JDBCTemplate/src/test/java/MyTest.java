import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @Description: TODO
 * @Author: acn
 * @Date: 2023/11/20/21:32
 */
@Slf4j
public class MyTest {
    static JdbcTemplate jdbcTemplate;
    static String sql;

    static void init() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
    }

    static int insert(User user) {
        sql = "insert into user(name,pass) values(" + user.getName() + "," + user.getPass() + ")";
        return jdbcTemplate.update(sql);
    }

    static int update(User user) {
        sql = "update user set name=? ,pass=? where id=?";
        return jdbcTemplate.update(sql,
                user.getName(),
                user.getPass(),
                user.getId());
    }

    static int delete(Long id) {
        sql = "delete from user where id=?";
        return jdbcTemplate.update(sql, id);
    }

    static User getOne(Long id) {
        sql = "select * from user where id=?" + id;
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class));
    }

    static Long getCount(String name) {
        sql = "select count(*) from user where name=?" + name;
        return jdbcTemplate.queryForObject(sql,Long.class);
    }

    static List<User> getUserList(){
        sql = "select * from user";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(User.class));
    }

    static List<User> getUserList(User user){
        sql = "select * from user where 1=1 and name=? and pass=?";
        return jdbcTemplate.query(sql,new Object[]{user.getName(),user.getPass()},new BeanPropertyRowMapper<>(User.class));
    }

    public static void main(String[] args) {
        init();
        getUserList().forEach(System.out::println);
    }
}