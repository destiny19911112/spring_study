package com.xiongxl.DesignMode.Adapter;

/**
 * @author xiongxl
 * @version $Id: Adapter.java, v 0.1 2019-02-28 18:16 xiongxl Exp $$
 * @desc
 */
public class Adapter implements Ps2 {

    private Usb usb;

    public Adapter(Usb usb) {
        this.usb = usb;
    }

    @Override
    public void isPs2() {
        usb.isUsb();
    }
}
