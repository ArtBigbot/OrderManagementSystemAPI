package com.example.orderManagementSystemAPI.DAO;

import com.example.orderManagementSystemAPI.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDAO extends CrudRepository {
    public Product createProduct (Product product);
}
