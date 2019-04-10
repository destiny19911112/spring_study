import com.xiongxl.aop.HelloWorld;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xiongxl
 * @version $Id: TestAop.java, v 0.1 2019-03-04 15:01 xiongxl Exp $$
 * @desc
 */
public class TestAop {

    @Test
    public void testAop1() {
        /*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-aop.xml");
        HelloWorld helloWorld1 = (HelloWorld) applicationContext.getBean("helloWorldImpl1");
        HelloWorld helloWorld2 = (HelloWorld) applicationContext.getBean("helloWorldImpl2");
        helloWorld1.printHelloWorld();
        System.out.println();
        helloWorld1.doPrint();
        System.out.println();
        helloWorld2.printHelloWorld();
        System.out.println();
        helloWorld2.doPrint();*/
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-aop.xml");
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorldImpl1");
        helloWorld.printHelloWorld();
        helloWorld.doPrint();
    }
}
