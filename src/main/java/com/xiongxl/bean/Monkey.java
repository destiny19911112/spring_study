package com.xiongxl.bean;

import org.springframework.stereotype.Service;

/**
 *
 * @author xiongxl
 * @version $Id: Monkey.java, v 0.1 2019-03-03 下午10:43 xiongxl Exp $$
 */
@Service(value = "monkey")
public class Monkey {
    private String monkeyName = "MonkeyKing";

    @Override
    public String toString() {
        return "Monkey{" +
                "monkeyName='" + monkeyName + '\'' +
                '}';
    }
}
