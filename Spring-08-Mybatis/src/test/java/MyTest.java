import com.acn.mapper.StudentMapper;
import com.acn.mapper.StudentMapperImpl;
import com.acn.mapper.StudentMapperImpl2;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/11/17/17:34
 */

@Slf4j
public class MyTest {

    @Test
    public void connectionTest() throws IOException {
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("db/mybatis-config.xml")).openSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        mapper.selectAllStudents().forEach(System.out::println);
    }

    @Test
    public void springConfigTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentMapper studentMapper = context.getBean("studentMapper", StudentMapper.class);
        studentMapper.selectAllStudents().forEach(System.out::println);
    }
    @Test
    public void springConfig2Test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentMapper studentMapper = context.getBean("studentMapper2", StudentMapper.class);
        studentMapper.selectAllStudents().forEach(System.out::println);
    }

}
