/**
 * ymm56.com Inc.
 * Copyright (c) 2013-2019 All Rights Reserved.
 */
package com.xiongxl.designMode.responsibilityChain;

/**
 * 责任链模式 上学前的准备工作
 * @author xiongxl
 * @version $Id: PreparationWorkList.java, v 0.1 2019-04-15 下午4:00 xiongxl Exp $$
 */
public class PreparationWorkList {

    // 是否需要洗脸
    private boolean washFace;

    // 是否需要洗头
    private boolean washHair;

    //是否需要吃早餐
    private boolean haveBreakfast;

    public boolean isWashFace() {
        return washFace;
    }

    public void setWashFace(boolean washFace) {
        this.washFace = washFace;
    }

    public boolean isWashHair() {
        return washHair;
    }

    public void setWashHair(boolean washHair) {
        this.washHair = washHair;
    }

    public boolean isHaveBreakfast() {
        return haveBreakfast;
    }

    public void setHaveBreakfast(boolean haveBreakfast) {
        this.haveBreakfast = haveBreakfast;
    }

    @Override
    public String toString() {
        return "PreparationWorkList{" +
                "washFace=" + washFace +
                ", washHair=" + washHair +
                ", haveBreakfast=" + haveBreakfast +
                '}';
    }
}
