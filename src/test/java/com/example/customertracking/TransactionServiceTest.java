package com.example.customertracking;

import com.example.customertracking.service.TransactionService;
import org.junit.Assert;
import org.junit.Test;

public class TransactionServiceTest {
    @Test
    public void testGetTransactions() {
        TransactionService ts = new TransactionService();
        Assert.assertNotNull(ts.getTransactionsByCustomerId(1));
    }
}
