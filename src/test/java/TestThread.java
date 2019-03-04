/**
 * ymm56.com Inc.
 * Copyright (c) 2013-2019 All Rights Reserved.
 */

import com.xiongxl.bean.Zoo;
import com.xiongxl.thread.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author xiongxl
 * @version $Id: TestThread.java, v 0.1 2019-03-02 下午5:41 xiongxl Exp $$
 */
public class TestThread {

    @Test
    public void testMyThread01() {
        MyThread01 myThread01 = new MyThread01();
        myThread01.start();
        for (int i=0; i<3; i++) {
            try {
                Thread.sleep((long)Math.random() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("当前线程为：" + Thread.currentThread().getName());
        }
    }

    @Test
    public void testMyThread02() {
        MyThread02 myThread0201 = new MyThread02();
        MyThread02 myThread0202 = new MyThread02();
        MyThread02 myThread0203 = new MyThread02();
        myThread0201.start();
        myThread0202.start();
        myThread0203.start();
    }

    @Test
    public void testMyThread03() throws Exception{
        MyThread03 myThread03 = new MyThread03();
        System.out.println("(1)当前线程是否处在活动状态：" + myThread03.isAlive());
        myThread03.start();
        Thread.sleep(100);
        System.out.println("(3)当前线程是否处在活动状态：" + myThread03.isAlive());
    }

    @Test
    public void testMyThread04() {
        System.out.println("main thread begin, priority = " + Thread.currentThread().getPriority());
        System.out.println("main thread end, priority = " + Thread.currentThread().getPriority());
        MyThread04_1 myThread04_1 = new MyThread04_1();
        myThread04_1.start();

    }

    @Test
    public void testZoo() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-bean.xml");
        Zoo zoo = (Zoo) applicationContext.getBean("zoo");
        System.out.println(zoo.toString());
    }
}
