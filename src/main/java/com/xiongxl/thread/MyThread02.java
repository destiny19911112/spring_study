package com.xiongxl.thread;

/**
 *
 * @author xiongxl
 * @version $Id: MyThread02.java, v 0.1 2019-03-02 下午5:58 xiongxl Exp $$
 */
public class MyThread02 extends Thread {

    @Override
    public void run() {
        System.out.println("当前运行线程：" + Thread.currentThread().getName());
    }
}
