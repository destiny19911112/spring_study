package com.xiongxl.DesignMode.Adapter;

/**
 * @author xiongxl
 * @version $Id: LazySingleton.java, v 0.1 2019-03-01 16:13 xiongxl Exp $$
 * @desc
 */
public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
