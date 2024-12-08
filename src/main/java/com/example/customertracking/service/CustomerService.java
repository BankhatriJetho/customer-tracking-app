package com.example.customertracking.service;

import com.example.customertracking.dao.CustomerDAO;
import com.example.customertracking.model.Customer;
import java.util.List;

public class CustomerService {
    private CustomerDAO customerDAO = new CustomerDAO();

    public List<Customer> getAllCustomers() {
        return customerDAO.getAllCustomers();
    }

    public Customer getCustomerById(int id) {
        return customerDAO.getCustomerById(id);
    }

    public boolean updateCustomer(Customer c) {
        return customerDAO.updateCustomer(c);
    }
}
