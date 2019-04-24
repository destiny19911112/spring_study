package com.xiongxl.designMode.responsibilityChain;

/**
 *
 * @author xiongxl
 * @version $Id: HaveBreakFastFilter.java, v 0.1 2019-04-15 下午4:40 xiongxl Exp $$
 */
public class HaveBreakFastFilter extends AbstractPrepareFilter {

    public HaveBreakFastFilter(AbstractPrepareFilter nextPrepareFilter) {
        super(nextPrepareFilter);
    }

    @Override
    public void prepare(PreparationWorkList preparationWorkList) {
        if (preparationWorkList.isHaveBreakfast()) {
            System.out.println("吃早餐");
        }
    }
}
