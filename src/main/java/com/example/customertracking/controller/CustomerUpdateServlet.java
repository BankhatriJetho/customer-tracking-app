package com.example.customertracking.controller;

import com.example.customertracking.model.Customer;
import com.example.customertracking.service.CustomerService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class CustomerUpdateServlet extends HttpServlet {
    private CustomerService customerService = new CustomerService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int customerId = Integer.parseInt(req.getParameter("id"));
        Customer c = customerService.getCustomerById(customerId);
        req.setAttribute("customer", c);
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/customerUpdate.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Customer c = new Customer();
        c.setCustomerId(Integer.parseInt(req.getParameter("customerId")));
        c.setName(req.getParameter("name"));
        c.setEmail(req.getParameter("email"));
        c.setPhone(req.getParameter("phone"));
        c.setAddress(req.getParameter("address"));
        c.setStatus(req.getParameter("status"));

        if(customerService.updateCustomer(c)) {
            resp.sendRedirect(req.getContextPath() + "/customers/list");
        } else {
            req.setAttribute("errorMessage", "Failed to update customer");
            RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/customerUpdate.jsp");
            rd.forward(req, resp);
        }
    }
}
