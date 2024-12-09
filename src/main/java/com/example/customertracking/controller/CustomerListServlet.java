package com.example.customertracking.controller;

import com.example.customertracking.model.Customer;
import com.example.customertracking.service.CustomerService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class CustomerListServlet extends HttpServlet {
    private CustomerService customerService = new CustomerService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Customer> customers = customerService.getAllCustomers();
        req.setAttribute("customers", customers);
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/customerList.jsp");
        rd.forward(req, resp);
    }
}
