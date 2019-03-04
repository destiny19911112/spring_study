package com.xiongxl.designMode.adapter;

/**
 * @author xiongxl
 * @version $Id: adapter.java, v 0.1 2019-02-28 18:16 xiongxl Exp $$
 * @desc
 */
public class Adapter implements com.xiongxl.designMode.adapter.Ps2 {

    private com.xiongxl.designMode.adapter.Usb usb;

    public Adapter(com.xiongxl.designMode.adapter.Usb usb) {
        this.usb = usb;
    }

    @Override
    public void isPs2() {
        usb.isUsb();
    }
}