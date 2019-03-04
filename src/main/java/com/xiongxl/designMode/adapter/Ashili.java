package com.xiongxl.DesignMode.Adapter;

/**
 * @author xiongxl
 * @version $Id: Ashili.java, v 0.1 2019-03-01 14:06 xiongxl Exp $$
 * @desc
 */
public class Ashili extends Adapter1{

    @Override
    public void a() {
        System.out.println("实现A方法被调用");
    }

    @Override
    public void b() {
        System.out.println("实现B方法被调用");
    }
}
