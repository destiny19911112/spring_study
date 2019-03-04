/**
 * ymm56.com Inc.
 * Copyright (c) 2013-2019 All Rights Reserved.
 */
package com.xiongxl.thread;

/**
 *
 * @author xiongxl
 * @version $Id: MyThread01.java, v 0.1 2019-03-02 下午5:36 xiongxl Exp $$
 */
public class MyThread01 extends Thread{

    @Override
    public void run() {
        for (int i=0; i<3; i++) {
            try {
                Thread.sleep((long) Math.random() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("当前运行线程：" + Thread.currentThread().getName());
        }
    }
}
