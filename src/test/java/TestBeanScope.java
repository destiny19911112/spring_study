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
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-beanscope.xml");
        BeanScope beanScope1 = (BeanScope) ctx.getBean("beanScope");
        BeanScope beanScope2 = (BeanScope) ctx.getBean("beanScope");
        System.out.println("当前Bean hashCode:" + beanScope1.hashCode());
        System.out.println("当前Bean hashCode:" + beanScope2.hashCode());
        System.out.println("两个Bean是否为一个实例：" + beanScope1.equals(beanScope2));
    }
}
