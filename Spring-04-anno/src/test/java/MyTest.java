import com.acn.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/11/11/21:28
 */
public class MyTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user.name);
    }
}