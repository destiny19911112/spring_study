package com.xiongxl.aop;

/**
 * @author xiongxl
 * @version $Id: LogHandler.java, v 0.1 2019-03-04 15:40 xiongxl Exp $$
 * @desc
 */
public class LogHandler {

    public void LogBefore() {
        System.out.println("Log before method");
    }

    public void LogAfter() {
        System.out.println("Log after method");
    }
}
