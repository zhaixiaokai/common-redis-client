import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext-redis-connector.xml");
        Object bean = context.getBean("redisTemplate");
        System.out.println(bean);
    }
}
