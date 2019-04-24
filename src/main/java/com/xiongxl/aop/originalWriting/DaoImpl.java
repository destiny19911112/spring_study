package com.xiongxl.aop.originalWriting;

/**
 *
 * @author xiongxl
 * @version $Id: DaoImpl.java, v 0.1 2019-04-10 下午2:36 xiongxl Exp $$
 */
public class DaoImpl implements Dao {

    public void insert() {
        System.out.println("====dao.insert()====");
    }

    public void delete() {
        System.out.println("====dao.delete()====");
    }

    public void update() {
        System.out.println("====dao.update()====");
    }
}
