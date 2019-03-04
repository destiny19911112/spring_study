package com.xiongxl.bean;

import org.springframework.stereotype.Service;

/**
 * @author xiongxl
 * @version $Id: BMW.java, v 0.1 2019-03-04 9:32 xiongxl Exp $$
 * @desc
 */
@Service(value = "Bmw")
public class Bmw implements Car {

    @Override
    public String carName() {
        return "BMW car";
    }
}
