/**
 * ymm56.com Inc.
 * Copyright (c) 2013-2019 All Rights Reserved.
 */
package com.xiongxl.designMode.strategy;

import org.junit.Test;

/**
 *
 * @author xiongxl
 * @version $Id: TestMain.java, v 0.1 2019-04-15 下午1:51 xiongxl Exp $$
 */
public class TestMain {

    public static void main(String[] args) {
        Strategy strategyA = new StrategyA();
        Strategy strategyB = new StrategyB();

        Context context = new Context(strategyA);
        context.strategyMethod();
        context = new Context(strategyB);
        context.strategyMethod();
    }
}
