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
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");// 可以传不定参数
        // 对象都在Spring中管理了，要使用就直接从ApplicationContext中取出来
//        Hello hello = (Hello) context.getBean("你好");
        Hello 你好 = context.getBean("你好", Hello.class);// 使用反射给定返回类型就不用强转了
        你好.show();
    }
}
