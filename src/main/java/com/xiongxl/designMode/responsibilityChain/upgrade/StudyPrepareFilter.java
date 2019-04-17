/**
 * ymm56.com Inc.
 * Copyright (c) 2013-2019 All Rights Reserved.
 */
package com.xiongxl.designMode.responsibilityChain.upgrade;

import com.xiongxl.designMode.responsibilityChain.PreparationWorkList;

/**
 *
 * @author xiongxl
 * @version $Id: StudyPrepareFilter.java, v 0.1 2019-04-16 上午10:15 xiongxl Exp $$
 */
public interface StudyPrepareFilter {
    public void doFilter(PreparationWorkList preparationWorkList, FilterChain filterChain);
}
