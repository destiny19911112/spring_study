/**
 * ymm56.com Inc.
 * Copyright (c) 2013-2019 All Rights Reserved.
 */

import com.xiongxl.BeanScope;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author xiongxl
 * @version $Id: TestBeanScope.java, v 0.1 2019-02-26 下午11:21 xiongxl Exp $$
 */
public class TestBeanScope {

    @Test
    public void test() {
        ApplicationContext act = new ClassPathXmlApplicationContext("spring-beanscope.xml");
        act.getBean("beanScope");
        ((ClassPathXmlApplicationContext) act).close();
    }
}
