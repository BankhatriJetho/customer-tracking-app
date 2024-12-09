package com.example.customertracking;

import com.example.customertracking.service.CustomerService;
import org.junit.Assert;
import org.junit.Test;

public class CustomerServiceTest {
    @Test
    public void testGetAllCustomers() {
        CustomerService cs = new CustomerService();
        Assert.assertNotNull(cs.getAllCustomers());
    }
}
