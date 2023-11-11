import com.acn.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/11/11/17:10
 */
public class MyTest {

    @Test
    public void testByName(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Person p2 = context.getBean("p2", Person.class);
        p2.getCat().shout();
        p2.getDog().shout();
    }
    @Test
    public void testByType(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Person p3 = context.getBean("p3", Person.class);
        p3.getCat().shout();
        p3.getDog().shout();
    }


}
