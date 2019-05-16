package com.frankie.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
    private static final String name = "root";
    private static final String password = "123456";
    private static final String url = "jdbc:mysql://localhost:3306/management";
    private static Connection conn;
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, name, password);
        } catch (ClassNotFoundException e) {
            System.out.println("未找到驱动，请检查拼写！");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("未成功连接数据库，请检查用户名及密码");
            e.printStackTrace();
        }
        return conn;
    }
}
