package com.xiongxl.service;

import com.xiongxl.dao.AutoWiringDao;

/**
 * @author xiongxl
 * @version $Id: AutoWiringService.java, v 0.1 2019-02-28 16:58 xiongxl Exp $$
 * @desc
 */
public class AutoWiringService {

    private AutoWiringDao autoWiringDao;

    public AutoWiringService(AutoWiringDao autoWiringDao) {
        this.autoWiringDao = autoWiringDao;
    }

    public void say(String word) {
        this.autoWiringDao.say(word);
     }
}
