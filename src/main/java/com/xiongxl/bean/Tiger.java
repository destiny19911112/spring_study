/**
 * ymm56.com Inc.
 * Copyright (c) 2013-2019 All Rights Reserved.
 */
package com.xiongxl.bean;

import org.springframework.stereotype.Service;

/**
 *
 * @author xiongxl
 * @version $Id: Tiger.java, v 0.1 2019-03-03 下午10:42 xiongxl Exp $$
 */
@Service(value = "tiger")
public class Tiger {

    private String tigerName = "TigerKing";

    @Override
    public String toString() {
        return "Tiger{" +
                "tigerName='" + tigerName + '\'' +
                '}';
    }
}
