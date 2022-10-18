package com.example.orderManagementSystemAPI.DAOimplService;

import com.example.orderManagementSystemAPI.DAO.CustomerDAO;
import com.example.orderManagementSystemAPI.model.Customer;

public abstract class CustomerDAOImplService implements CustomerDAO {
    private CustomerDAO customerDAO;
    @Override
    public Customer createCustomer(Customer customer) {

        customerDAO.save(customer);
        return customer;
    }
}
