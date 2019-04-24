package com.xiongxl.designMode.responsibilityChain.upgrade;

import com.xiongxl.designMode.responsibilityChain.PreparationWorkList;

/**
 *
 * @author xiongxl
 * @version $Id: HaveBreakFastFilter.java, v 0.1 2019-04-16 上午10:39 xiongxl Exp $$
 */
public class HaveBreakFastFilter implements StudyPrepareFilter {

    public void doFilter(PreparationWorkList preparationWorkList, FilterChain filterChain) {
        if (preparationWorkList.isHaveBreakfast()) {
            System.out.println("吃完早饭....");
        }
        filterChain.doFilter(preparationWorkList, filterChain);
    }
}
