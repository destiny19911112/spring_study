package com.xiongxl.designMode.adapter;

/**
 * @author xiongxl
 * @version $Id: adapter.java, v 0.1 2019-02-28 18:16 xiongxl Exp $$
 * @desc
 */
public class Adapter extends Usber implements Ps2 {

    public void isPs2() {
        isUsb();
    }
}