package com.xiongxl.designMode.responsibilityChain.upgrade;

import com.xiongxl.designMode.responsibilityChain.PreparationWorkList;

/**
 *
 * @author xiongxl
 * @version $Id: WashFaceFilter.java, v 0.1 2019-04-16 上午10:36 xiongxl Exp $$
 */
public class WashFaceFilter implements StudyPrepareFilter{

    public void doFilter(PreparationWorkList preparationWorkList, FilterChain filterChain) {
        if (preparationWorkList.isWashFace()) {
            System.out.println("洗完脸....");
        }
        filterChain.doFilter(preparationWorkList, filterChain);
    }
}
