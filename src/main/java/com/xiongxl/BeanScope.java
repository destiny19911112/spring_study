package com.xiongxl;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author xiongxl
 * @version $Id: BeanScope.java, v 0.1 2019-02-27 16:05 xiongxl Exp $$
 * @desc
 */
public class BeanScope implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("我正在初始化...");
    }
}
