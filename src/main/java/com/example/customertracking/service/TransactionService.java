package com.example.customertracking.service;

import com.example.customertracking.dao.TransactionDAO;
import com.example.customertracking.model.Transaction;
import java.util.List;

public class TransactionService {
    private TransactionDAO transactionDAO = new TransactionDAO();

    public List<Transaction> getTransactionsByCustomerId(int customerId) {
        return transactionDAO.getTransactionsByCustomerId(customerId);
    }
}
