package com.example.customertracking.controller;

import com.example.customertracking.service.AdminService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class AdminLoginServlet extends HttpServlet {
    private AdminService adminService = new AdminService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/adminLogin.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if(adminService.authenticate(username, password)) {
            HttpSession session = req.getSession(true);
            session.setAttribute("adminUser", username);
            resp.sendRedirect(req.getContextPath() + "/customers/list");
        } else {
            req.setAttribute("errorMessage", "Invalid Credentials");
            RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/adminLogin.jsp");
            rd.forward(req, resp);
        }
    }
}
