package com.frankie.dao;

import com.frankie.entity.User;
import com.frankie.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserDao{

    public Boolean getUserByProperties(String loginName,String password){
        Connection conn = JDBCUtil.getConnection();
        String sql = "select * from user_inf where loginname = ? and password = ?";
        boolean userIfExist = false;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            statement = conn.prepareStatement(sql);
            statement.setString(1,loginName);
            statement.setString(2,password);
            resultSet = statement.getResultSet();
            if(resultSet != null){
                userIfExist = true;
            }
        } catch (SQLException e) {
            System.out.println("查询语句时出错，请核对后重试！");
            e.printStackTrace();
        } finally {
            try {
                if(resultSet != null){
                    resultSet.close();
                }
                statement.close();
                conn.close();
            } catch (SQLException e) {
                System.out.println("关闭资源出错！");
                e.printStackTrace();
            }
        }
        return userIfExist;
    }
}
