import com.personal.data.redis.connector.RedisConnector;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:applicationContext-redis-connector.xml"}) //加载配置文件
public class TestRedisConnector {

    @Autowired
    protected ApplicationContext ctx;

    @Test
    public void testRedis(){
        RedisConnector bean = (RedisConnector) ctx.getBean("redisTemplate");
        System.out.println(bean);
        bean.opsForValue().set("hello","jaye");
        Object value = bean.keys("*");
        System.out.println(bean.opsForValue().get("hello"));
        System.out.println(String.valueOf(value));
        //ValueOperations<String,String> operations = redisTemplate.opsForValue();
        //operations.set("key-test","test");
    }
}
