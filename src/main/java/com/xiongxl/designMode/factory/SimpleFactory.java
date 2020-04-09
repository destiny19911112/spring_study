package com.xiongxl.designMode.factory;

/**
 * @author xiongxl
 * @version $Id: SimpleFactory.java, v 0.1 2020-04-09 Exp $$
 * @desc 简单工厂 -- 用于创建不同类型的 coffee
 */
public class SimpleFactory {

    public static Coffee createInstance(String type) {
        if ("Americano".equals(type)) {
            return new Americano();
        } else if ("Cappuccino".equals(type)) {
            return new Cappuccino();
        } else if ("Latte".equals(type)) {
            return new Latte();
        } else {
            throw new RuntimeException("类型不可识别，没有可以实例化的对象！");
        }
    }

    public static void main(String[] args) {
        Coffee latte = SimpleFactory.createInstance("Americano");
        System.out.println(latte.getName());
    }
}
