package com.xiongxl.designMode.responsibilityChain;

/**
 *
 * @author xiongxl
 * @version $Id: WashFaceFilter.java, v 0.1 2019-04-15 下午4:19 xiongxl Exp $$
 */
public class WashFaceFilter extends AbstractPrepareFilter {

    public WashFaceFilter(AbstractPrepareFilter nextPrepareFilter) {
        super(nextPrepareFilter);
    }

    @Override
    public void prepare(PreparationWorkList preparationWorkList) {
        if (preparationWorkList.isWashFace()) {
            System.out.println("洗脸");
        }
    }
}
