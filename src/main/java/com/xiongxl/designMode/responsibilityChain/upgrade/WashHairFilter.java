package com.xiongxl.designMode.responsibilityChain.upgrade;

import com.xiongxl.designMode.responsibilityChain.PreparationWorkList;

/**
 *
 * @author xiongxl
 * @version $Id: WashHairFilter.java, v 0.1 2019-04-16 上午10:33 xiongxl Exp $$
 */
public class WashHairFilter implements StudyPrepareFilter {

    public void doFilter(PreparationWorkList preparationWorkList, FilterChain filterChain) {
        if (preparationWorkList.isWashHair()) {
            System.out.println("洗完头发....");
        }
        filterChain.doFilter(preparationWorkList, filterChain);
    }
}
