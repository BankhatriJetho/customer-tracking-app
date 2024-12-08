package com.example.customertracking.filters;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AuthFilter implements Filter {
    public void init(FilterConfig filterConfig) {}
    public void destroy() {}

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpSession session = req.getSession(false);
        boolean loggedIn = (session != null && session.getAttribute("adminUser") != null);

        if(!loggedIn) {
            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/adminLogin.jsp");
            rd.forward(request, response);
        } else {
            chain.doFilter(request, response);
        }
    }
}
