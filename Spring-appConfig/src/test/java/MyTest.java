import com.acn.bean.User;
import com.acn.config.acnConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/11/14/22:05
 */
public class MyTest {

    @Test
    public void test(){
        // 只能通过AnnotationConfig获取上下文。通过配置类的class对象加载
        ApplicationContext context = new AnnotationConfigApplicationContext(acnConfig.class);
        User user = context.getBean("getUser", User.class);
        System.out.println(user.getName());
    }
}
