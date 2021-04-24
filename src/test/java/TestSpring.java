import com.example.basic.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Desription:
 *
 * @ClassName TestSpring
 * @Author Zhanyuwei
 * @Date 2021/4/24 2:34 下午
 * @Version 1.0
 **/
public class TestSpring {

    @Test
    public void test3() {
        // 获取spring的工厂
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        // 通过工厂类 获得 对象
        Person person = (Person) ctx.getBean("person");

        System.out.println(person);
    }
}
