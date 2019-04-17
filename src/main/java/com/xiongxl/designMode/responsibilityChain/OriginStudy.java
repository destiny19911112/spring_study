/**
 * ymm56.com Inc.
 * Copyright (c) 2013-2019 All Rights Reserved.
 */
package com.xiongxl.designMode.responsibilityChain;

/**
 *
 * @author xiongxl
 * @version $Id: OriginStudy.java, v 0.1 2019-04-16 上午9:21 xiongxl Exp $$
 */
public class OriginStudy {

    public void study(PreparationWorkList preparationWorkList) {
        if (preparationWorkList.isWashHair()) {
            System.out.println("洗头");
        }
        if (preparationWorkList.isWashFace()) {
            System.out.println("洗脸");
        }
        if (preparationWorkList.isHaveBreakfast()) {
            System.out.println("吃早饭");
        }
        System.out.println("我可以去上学了...");
    }
}
