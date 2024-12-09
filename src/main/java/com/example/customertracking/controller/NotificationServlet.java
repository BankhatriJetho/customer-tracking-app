package com.example.customertracking.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class NotificationServlet extends HttpServlet {
    // In future: integrate with email API or store notifications in DB
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/notificationForm.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String message = req.getParameter("message");
        String email = req.getParameter("email");
        // TODO: Implement actual email sending

        req.setAttribute("infoMessage", "Notification sent (not actually implemented)");
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/notificationForm.jsp");
        rd.forward(req, resp);
    }
}
