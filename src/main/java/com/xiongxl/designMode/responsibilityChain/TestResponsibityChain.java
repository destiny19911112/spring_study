package com.xiongxl.designMode.responsibilityChain;

import org.junit.Test;

/**
 * 测试责任链模式
 * @author xiongxl
 * @version $Id: TestResponsibityChain.java, v 0.1 2019-04-15 下午4:44 xiongxl Exp $$
 */
public class TestResponsibityChain {

    @Test
    public void test() {
        PreparationWorkList preparationWorkList = new PreparationWorkList();
        preparationWorkList.setWashHair(false);
        preparationWorkList.setWashFace(true);
        preparationWorkList.setHaveBreakfast(true);

        Study study = new Study();

        AbstractPrepareFilter haveBreakFastFilter = new HaveBreakFastFilter(null);
        AbstractPrepareFilter washFaceFilter = new WashFaceFilter(haveBreakFastFilter);
        AbstractPrepareFilter washHairFilter = new WashHairFilter(washFaceFilter);
        washHairFilter.doFilter(preparationWorkList, study);
    }
}
