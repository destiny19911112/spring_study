package com.xiongxl.ibatis.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ResourceBundle;

/**
 * 数据库连接工具
 * @author xiongxl
 * @version $Id: DBUtil.java, v 0.1 2019-04-19 上午9:20 xiongxl Exp $$
 */
public class DBUtil {
    private static Connection connection = null;
    private static Statement statement;
    private static PreparedStatement preparedStatment;
    /*private static String url = "";
    private static String driver = "";
    private static String username = "";
    private static String password = "";*/
    private static String url = "jdbc:mysql://10.21.36.154:3306/lcfa?useUnicode=true&characterEncoding=utf8";
    private static String driver = "com.mysql.jdbc.Driver";
    private static String username = "root";
    private static String password = "4A@asiainfo";

    /*static {
        ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
        url = bundle.getString("jdbc.url");
        driver = bundle.getString("jdbc.driverClassName");
        username = bundle.getString("jdbc.username");
        password = bundle.getString("jdbc.password");
    }*/

    public DBUtil(){}

    public static Connection getConnection() {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
