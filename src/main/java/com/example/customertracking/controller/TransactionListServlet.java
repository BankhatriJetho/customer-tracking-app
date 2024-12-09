package com.example.customertracking.controller;

import com.example.customertracking.model.Transaction;
import com.example.customertracking.service.TransactionService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class TransactionListServlet extends HttpServlet {
    private TransactionService transactionService = new TransactionService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int customerId = Integer.parseInt(req.getParameter("customerId"));
        List<Transaction> transactions = transactionService.getTransactionsByCustomerId(customerId);
        req.setAttribute("transactions", transactions);
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/transactionList.jsp");
        rd.forward(req, resp);
    }
}
