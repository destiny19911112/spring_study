package com.xiongxl.DesignMode.Adapter;

/**
 * @author xiongxl
 * @version $Id: Adapter.java, v 0.1 2019-02-28 18:16 xiongxl Exp $$
 * @desc
 */
public class Adapter extends Usber implements Ps2 {

    @Override
    public void isPs2() {
        isUsb();
    }
}
