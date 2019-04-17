/**
 * ymm56.com Inc.
 * Copyright (c) 2013-2019 All Rights Reserved.
 */
package com.xiongxl.designMode.responsibilityChain;

/**
 *
 * @author xiongxl
 * @version $Id: AbstractPrepareFilter.java, v 0.1 2019-04-15 下午4:05 xiongxl Exp $$
 */
public abstract class AbstractPrepareFilter {

    private AbstractPrepareFilter nextPrepareFilter;

    public AbstractPrepareFilter(AbstractPrepareFilter nextPrepareFilter) {
        this.nextPrepareFilter = nextPrepareFilter;
    }

    public void doFilter(PreparationWorkList preparationWorkList, Study study) {
        prepare(preparationWorkList);

        if(nextPrepareFilter == null) {
            study.study();
        } else {
            nextPrepareFilter.doFilter(preparationWorkList, study);
        }
    }

    public abstract void prepare(PreparationWorkList preparationWorkList);
}
