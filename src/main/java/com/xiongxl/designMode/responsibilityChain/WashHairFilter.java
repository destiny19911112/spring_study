package com.xiongxl.designMode.responsibilityChain;

/**
 *
 * @author xiongxl
 * @version $Id: WashHairFilter.java, v 0.1 2019-04-15 下午4:37 xiongxl Exp $$
 */
public class WashHairFilter extends AbstractPrepareFilter {

    public WashHairFilter(AbstractPrepareFilter nextPrepareFilter) {
        super(nextPrepareFilter);
    }

    @Override
    public void prepare(PreparationWorkList preparationWorkList) {
        if (preparationWorkList.isWashHair()) {
            System.out.println("洗头");
        }
    }
}
