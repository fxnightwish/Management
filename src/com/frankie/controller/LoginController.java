package com.frankie.controller;


import com.frankie.dao.UserDao;
import net.sf.json.JSONObject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String loginName = req.getParameter("loginname");
        String password = req.getParameter("password");
        UserDao dao = new UserDao();
        Boolean b = dao.getUserByProperties(loginName,password);
        if(b){
            req.getRequestDispatcher("/WEB-INF/view/main.jsp").forward(req,resp);
        }
        System.out.println("用户名或密码错误！");
        JSONObject.fromObject("用户名或密码错误！");
    }
}
