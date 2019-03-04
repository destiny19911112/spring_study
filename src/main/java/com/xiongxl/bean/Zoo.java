/**
 * ymm56.com Inc.
 * Copyright (c) 2013-2019 All Rights Reserved.
 */
package com.xiongxl.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *
 * @author xiongxl
 * @version $Id: Zoo.java, v 0.1 2019-03-03 下午10:44 xiongxl Exp $$
 */
@Service(value = "Zoo")
@Scope("prototype")
public class Zoo {

    @Autowired
    private Tiger tiger;

    @Autowired
    private Monkey monkey;

    @Override
    public String toString() {
        return "Zoo{" +
                "tiger=" + tiger +
                ", monkey=" + monkey +
                '}';
    }
}
