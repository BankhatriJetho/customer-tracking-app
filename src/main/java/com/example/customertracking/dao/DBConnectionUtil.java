package com.example.customertracking.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/customerdb";
    private static final String USER = "root";
    private static final String PASS = "password";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
