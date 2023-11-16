import com.acn.service.UserService;
import com.acn.service.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/11/15/23:52
 */
@Slf4j
public class MyTest {
    @Test
    public void text(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-config.xml");
        // 代理的是接口，如果给实现类就没有意义了
        UserService userService = context.getBean("userService", UserService.class);

        userService.add();
    }
}
