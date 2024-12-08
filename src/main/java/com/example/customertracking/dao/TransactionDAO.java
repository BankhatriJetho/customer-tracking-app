package com.example.customertracking.dao;

import com.example.customertracking.model.Transaction;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TransactionDAO {
    public List<Transaction> getTransactionsByCustomerId(int customerId) {
        String sql = "SELECT * FROM transactions WHERE customer_id = ? ORDER BY transaction_date DESC";
        List<Transaction> transactions = new ArrayList<>();
        try (Connection con = DBConnectionUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, customerId);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Transaction t = new Transaction();
                t.setTransactionId(rs.getInt("transaction_id"));
                t.setCustomerId(rs.getInt("customer_id"));
                t.setTransactionDate(rs.getTimestamp("transaction_date"));
                t.setAmount(rs.getDouble("amount"));
                t.setType(rs.getString("type"));
                t.setDescription(rs.getString("description"));
                transactions.add(t);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return transactions;
    }
}
