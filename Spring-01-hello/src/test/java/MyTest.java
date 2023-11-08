import com.acn.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/11/08/20:02
 */
public class MyTest {

    public static void main(String[] args) {

        // 获取Spring上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 对象都在Spring中管理了，要使用就直接从ApplicationContext中取出来
        Hello hello = (Hello) context.getBean("hello");
//        hello.show();
//        hello.showA();
        Hello hello2 = (Hello) context.getBean("hello");
        System.out.println(hello== hello2);
    }
}
