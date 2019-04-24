package com.xiongxl.designMode.responsibilityChain.upgrade;

import com.xiongxl.designMode.responsibilityChain.PreparationWorkList;
import com.xiongxl.designMode.responsibilityChain.Study;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author xiongxl
 * @version $Id: FilterChain.java, v 0.1 2019-04-16 上午10:19 xiongxl Exp $$
 */
public class FilterChain implements StudyPrepareFilter {

    private int pos = 0;

    private Study study;

    private List<StudyPrepareFilter> studyPrepareFilters;

    public FilterChain(Study study) {
        this.study = study;
    }

    public void doFilter(PreparationWorkList preparationWorkList, FilterChain filterChain) {
        // 所有过滤器执行完毕
        if (pos == studyPrepareFilters.size()) {
            study.study();
        }
        studyPrepareFilters.get(pos++).doFilter(preparationWorkList, filterChain);
    }

    public void addFilter(StudyPrepareFilter studyPrepareFilter) {
        if (studyPrepareFilters == null) {
            studyPrepareFilters = new ArrayList<StudyPrepareFilter>();
        }
        studyPrepareFilters.add(studyPrepareFilter);
    }
}
