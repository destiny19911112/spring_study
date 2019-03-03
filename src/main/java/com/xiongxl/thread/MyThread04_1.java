/**
 * ymm56.com Inc.
 * Copyright (c) 2013-2019 All Rights Reserved.
 */
package com.xiongxl.thread;

/**
 *
 * @author xiongxl
 * @version $Id: MyThread04_1.java, v 0.1 2019-03-03 下午5:14 xiongxl Exp $$
 */
public class MyThread04_1 extends Thread {

    @Override
    public void run() {
        System.out.println("MyThread04_1 run priority：" + this.getPriority());
        MyThread04_0 myThread04_0 = new MyThread04_0();
        myThread04_0.start();
    }
}
