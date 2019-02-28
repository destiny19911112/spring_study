package com.xiongxl.DesignMode.Adapter;

/**
 * @author xiongxl
 * @version $Id: Usber.java, v 0.1 2019-02-28 18:15 xiongxl Exp $$
 * @desc
 */
public class Usber implements Usb {

    @Override
    public void isUsb() {
        System.out.println("I am Usb");
    }
}
