package com.xiongxl;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author xiongxl
 * @version $Id: BeanScope.java, v 0.1 2019-02-27 16:05 xiongxl Exp $$
 * @desc
 */
public class BeanScope implements InitializingBean, DisposableBean{

    /*public void defaultInit() {
        System.out.println("我正在初始化创建中....");
    }

    public void defaultDestroy() {
        System.out.println("我正在初始化销毁中....");
    }*/

    public void init1() {
        System.out.println("初始化中....");
    }

    public void destroy1() {
        System.out.println("销毁中....");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("实现接口进行销毁....");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("实现接口进行初始化....");
    }
}
