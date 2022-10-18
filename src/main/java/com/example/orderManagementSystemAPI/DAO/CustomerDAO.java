package com.example.orderManagementSystemAPI.DAO;

import com.example.orderManagementSystemAPI.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerDAO extends CrudRepository {
    public Customer createCustomer (Customer customer);

}
