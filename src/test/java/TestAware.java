import com.xiongxl.service.AutoWiringService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xiongxl
 * @version $Id: TestAware.java, v 0.1 2019-02-28 15:52 xiongxl Exp $$
 * @desc
 */
public class TestAware {

    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-bean.xml");
        AutoWiringService autoWiringService = (AutoWiringService) applicationContext.getBean("autoWiringService");
        autoWiringService.say("this is a test...");
    }
}
