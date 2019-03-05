package com.xiongxl.aop;

/**
 * @author xiongxl
 * @version $Id: HelloWorldImpl2.java, v 0.1 2019-03-04 14:31 xiongxl Exp $$
 * @desc
 */
public class HelloWorldImpl2 implements HelloWorld {

    @Override
    public void printHelloWorld() {
        System.out.println("Enter HelloWorldImpl2.printHelloWorld()");
    }

    @Override
    public void doPrint() {
        System.out.println("Enter HelloWorldImpl2.doPrint()");
    }
}
