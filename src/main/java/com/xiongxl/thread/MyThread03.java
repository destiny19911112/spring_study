package com.xiongxl.thread;

/**
 *
 * @author xiongxl
 * @version $Id: MyThread03.java, v 0.1 2019-03-02 下午10:39 xiongxl Exp $$
 */
public class MyThread03 extends Thread{

    @Override
    public void run() {
        System.out.println("(2)当前线程是否处在活动状态：" + this.isAlive());
    }
}
