package com.xiongxl.designMode.strategy;

/**
 *
 * @author xiongxl
 * @version $Id: Context.java, v 0.1 2019-04-15 下午1:48 xiongxl Exp $$
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void strategyMethod() {
        strategy.useStrategy();;
    }
}
