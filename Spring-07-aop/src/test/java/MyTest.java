import com.acn.service.UserService;
import com.acn.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/11/15/23:52
 */
public class MyTest {
    @Test
    public void text(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-config.xml");
        UserService userService = context.getBean("userService", UserService.class);

        userService.add();
    }
}
