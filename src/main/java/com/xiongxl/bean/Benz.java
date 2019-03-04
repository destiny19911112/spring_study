package com.xiongxl.bean;

import org.springframework.stereotype.Service;

/**
 * @author xiongxl
 * @version $Id: Benz.java, v 0.1 2019-03-04 9:34 xiongxl Exp $$
 * @desc
 */
@Service
public class Benz implements Car {

    @Override
    public String carName() {
        return "Benz car";
    }
}
