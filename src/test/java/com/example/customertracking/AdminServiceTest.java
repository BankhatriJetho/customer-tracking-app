package com.example.customertracking;

import com.example.customertracking.service.AdminService;
import org.junit.Assert;
import org.junit.Test;

public class AdminServiceTest {
    @Test
    public void testAuthenticate() {
        AdminService service = new AdminService();
        boolean result = service.authenticate("admin", "admin123");
        // Depending on your DB data, adjust expected result
        Assert.assertTrue(result);
    }
}
