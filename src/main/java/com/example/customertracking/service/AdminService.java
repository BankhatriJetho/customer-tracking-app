package com.example.customertracking.service;

import com.example.customertracking.dao.AdminDAO;
import com.example.customertracking.model.Admin;
import com.example.customertracking.utils.PasswordUtil;

public class AdminService {
    private AdminDAO adminDAO = new AdminDAO();

    public boolean authenticate(String username, String password) {
        Admin admin = adminDAO.getAdminByUsername(username);
        if (admin != null) {
            return PasswordUtil.verifyPassword(password, admin.getPasswordHash());
        }
        return false;
    }
}
