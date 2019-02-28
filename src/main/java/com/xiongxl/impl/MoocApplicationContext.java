package com.xiongxl.impl;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author xiongxl
 * @version $Id: MoocApplicationContext.java, v 0.1 2019-02-28 15:45 xiongxl Exp $$
 * @desc
 */
public class MoocApplicationContext implements ApplicationContextAware {

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("MoocApplicationContext：" + applicationContext.getBean("moocApplicationContext").hashCode());
    }
}
