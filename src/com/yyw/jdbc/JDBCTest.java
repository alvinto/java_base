package com.yyw.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * JDBC
 * 加载驱动
 * 创建连接
 * 执行sql
 * 关闭连接
 * Created by wangshuai on 2016/4/21.
 */
public class JDBCTest {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://10.6.83.51:3306/yhywerp";
            String username = "root";
            String password = "123456";
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,username,password);
            String sql = "select * from ass_rma_order limit 1";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
