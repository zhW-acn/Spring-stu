import com.acn.Address;
import com.acn.Student;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;
import java.util.Set;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/11/10/11:23
 */
public class MyTest {
    ApplicationContext context;

    @Before
    public void before() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }


    @Test
    public void getStudent() {
        Student student = (Student) context.getBean("stu");
        System.out.println(student);

        Student stuC = context.getBean("stuC", Student.class);
        System.out.println(stuC);
//        Address address = context.getBean("addressC", Address.class);
//        System.out.println(address);
//        System.out.println(student.getWife() == null);

//        Properties info = student.getInfo();
//        Set<Object> keys = info.keySet();
//        for (Object key : keys) {
//            String string = key.toString();
//            String property = info.getProperty(string);
//            System.out.println(string + ":" + property);
//        }


        /*
        Student(
        name=acn,
        address=Address(address=芜湖),
        books=[书1, 书2, 书3],
        hobbies=[敲代码],
        card={身份证=123, 学生证=456},
        games=[LOL, COC, BOB],
        wife=null,
        info={学号=123, 班级=114514}
        )
         */
    }
}
