package com.xiongxl.ibatis.demo;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.xiongxl.ibatis.entity.Menu;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author xiongxl
 * @version $Id: IBatisDemo.java, v 0.1 2019-04-19 上午11:08 xiongxl Exp $$
 */
public class IBatisDemo {
    public static void main(String[] args) throws IOException,SQLException {
        String config = "com/xiongxl/ibatis/resources/config/SqlMapConfig.xml";
        Reader reader = Resources.getResourceAsReader(config);
        SqlMapClient sqlMapClient = SqlMapClientBuilder.buildSqlMapClient(reader);
        List<Menu> menuList = sqlMapClient.queryForList("getAllMenus");
        for (Menu menu : menuList) {
            System.out.println(menu);
        }
    }
}
