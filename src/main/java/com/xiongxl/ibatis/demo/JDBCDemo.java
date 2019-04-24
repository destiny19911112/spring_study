package com.xiongxl.ibatis.demo;

import com.xiongxl.ibatis.entity.Menu;
import com.xiongxl.ibatis.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author xiongxl
 * @version $Id: JDBCDemo.java, v 0.1 2019-04-19 上午9:40 xiongxl Exp $$
 */
public class JDBCDemo {
    public static Menu getMenu(int authId) {
        Menu menu = null;
        String sql = "select * from menu where auth_id = ?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DBUtil.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, authId);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                menu = new Menu();
                menu.setAuthId(resultSet.getInt("auth_id"));
                menu.setAuthName(resultSet.getString("auth_name"));
                menu.setMenuClassId(resultSet.getInt("menu_class_id"));
                menu.setAuthType(resultSet.getString("auth_type"));
                menu.setAuthUrl(resultSet.getString("auth_url"));
                menu.setAuthMark(resultSet.getString("auth_mark"));
                menu.setDesp(resultSet.getString("desp"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    if (connection != null) {
                        try {
                            connection.close();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            return menu;
        }
    }

    public static void main(String[] args) {
        System.out.println(getMenu(101903));
    }
}
