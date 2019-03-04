package com.xiongxl.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author xiongxl
 * @version $Id: CarFactory.java, v 0.1 2019-03-04 9:35 xiongxl Exp $$
 * @desc
 */
@Service
public class CarFactory {

    @Autowired
    @Qualifier(value = "Bmw")
    private Car car;

    @Override
    public String toString() {
        return "CarFactory{" +
                "car=" + car +
                '}';
    }
}
