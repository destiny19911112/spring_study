package com.xiongxl.designMode.responsibilityChain.upgrade;

import com.xiongxl.designMode.responsibilityChain.PreparationWorkList;
import com.xiongxl.designMode.responsibilityChain.Study;
import org.junit.Test;

/**
 *
 * @author xiongxl
 * @version $Id: TestUpgradeResponsibityChain.java, v 0.1 2019-04-16 上午10:41 xiongxl Exp $$
 */
public class TestUpgradeResponsibityChain {

    @Test
    public void test() {
        PreparationWorkList preparationWorkList = new PreparationWorkList();
        preparationWorkList.setWashHair(false);
        preparationWorkList.setWashFace(false);
        preparationWorkList.setHaveBreakfast(true);

        Study study = new Study();

        StudyPrepareFilter washHairFilter = new WashHairFilter();
        StudyPrepareFilter washFaceFilter = new WashFaceFilter();
        StudyPrepareFilter haveBreakFastFilter = new HaveBreakFastFilter();

        FilterChain filterChain = new FilterChain(study);
        filterChain.addFilter(washHairFilter);
        filterChain.addFilter(washFaceFilter);
        filterChain.addFilter(haveBreakFastFilter);

        filterChain.doFilter(preparationWorkList, filterChain);
    }
}
