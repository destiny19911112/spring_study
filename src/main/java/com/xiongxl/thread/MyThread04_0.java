package com.xiongxl.thread;

/**
 *
 * @author xiongxl
 * @version $Id: MyThread04_0.java, v 0.1 2019-03-03 下午5:12 xiongxl Exp $$
 */
public class MyThread04_0 extends Thread {

    @Override
    public void run() {
        System.out.println("MyThread04_0 run priority：" + this.getPriority());
    }
}
