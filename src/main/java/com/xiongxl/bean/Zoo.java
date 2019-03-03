/**
 * ymm56.com Inc.
 * Copyright (c) 2013-2019 All Rights Reserved.
 */
package com.xiongxl.bean;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author xiongxl
 * @version $Id: Zoo.java, v 0.1 2019-03-03 下午10:44 xiongxl Exp $$
 */
public class Zoo {

    @Autowired(required = false)
    private Tiger tiger;

    @Autowired(required = false)
    private Monkey monkey;

    @Override
    public String toString() {
        return "Zoo{" +
                "tiger=" + tiger +
                ", monkey=" + monkey +
                '}';
    }
}
