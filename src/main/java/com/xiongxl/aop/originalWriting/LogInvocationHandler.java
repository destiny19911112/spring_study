package com.xiongxl.aop.originalWriting;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *
 * @author xiongxl
 * @version $Id: LogInvocationHandler.java, v 0.1 2019-04-10 下午3:26 xiongxl Exp $$
 */
public class LogInvocationHandler implements InvocationHandler {

    private Object obj;

    public LogInvocationHandler(Object obj) {
        this.obj = obj;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        if ("insert".equals(methodName) || "update".equals(methodName)) {
            System.out.println(methodName + "()方法开始时间：" + System.currentTimeMillis());
            Object result = method.invoke(obj, args);
            System.out.println(methodName + "()方法结束时间：" + System.currentTimeMillis());
            return result;
        }
        return method.invoke(obj, args);
    }
}
