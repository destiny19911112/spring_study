package com.xiongxl.aop.originalWriting;

/**
 * @desc 采用 装饰器模式，装饰器模式的核心是实现Dao接口并持有Dao接口的引用
 * 在使用的时候，可以使用 "Dao dao = new LogDao(new DaoImpl());" 的方式，这种做法的优点为：
 * （1）透明，对于调用方来说，它只知道Dao,而不知道加上了日志功能。
 * （2）类不会无线膨胀，如果Dao的其他实现类需要输出日志，只需要向LogDao的构造函数中传入不同的Dao实现类即可
 * 不过这种方式同样有很明显的缺点，缺点为：
 * （1）输出日志的逻辑还是无法复用
 * （2）输出日志的逻辑和代码有耦合，如果我要对delete方法前后同样输出时间，需要修改LogDao
 * @author xiongxl
 * @version $Id: LogDao.java, v 0.1 2019-04-10 下午2:57 xiongxl Exp $$
 */
public class LogDao implements Dao{

    private Dao dao;

    public LogDao(Dao dao) {
        this.dao = dao;
    }

    public void insert() {
        System.out.println("insert() 方法开始时间：" + System.currentTimeMillis());
        dao.insert();
        System.out.println("insert() 方法结束时间：" + System.currentTimeMillis());
    }

    public void delete() {
        dao.delete();
    }

    public void update() {
        System.out.println("update() 方法开始时间：" + System.currentTimeMillis());
        dao.update();
        System.out.println("update() 方法结束时间：" + System.currentTimeMillis());
    }
}
