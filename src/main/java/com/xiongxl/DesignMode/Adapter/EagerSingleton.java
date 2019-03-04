package com.xiongxl.DesignMode.Adapter;

/**
 * @author xiongxl
 * @version $Id: EagerSingleton.java, v 0.1 2019-03-01 15:49 xiongxl Exp $$
 * @desc
 */
public class EagerSingleton {

    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return instance;
    }
}
