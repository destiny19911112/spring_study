package com.xiongxl.aop;

/**
 * @author xiongxl
 * @version $Id: TimeHandler.java, v 0.1 2019-03-04 14:39 xiongxl Exp $$
 * @desc
 */
public class TimeHandler {

    public void beforePrintTime() {
        System.out.println("Before Method Invoke, CurrentTime：" + System.currentTimeMillis());
    }

    public void afterPrintTime() {
        System.out.println("After Method Invoke, CurrentTime：" + System.currentTimeMillis());
    }
}
