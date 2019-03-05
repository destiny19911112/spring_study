package com.xiongxl.aop;

/**
 * @author xiongxl
 * @version $Id: HelloWorldImpl1.java, v 0.1 2019-03-04 14:15 xiongxl Exp $$
 * @desc
 */
public class HelloWorldImpl1 implements HelloWorld {

    @Override
    public void printHelloWorld() {
        System.out.println("Enter HelloWorldImpl1.printHelloWorld");
    }

    @Override
    public void doPrint() {
        System.out.println("Enter HelloWorldImpl1.doPrint");
    }
}
