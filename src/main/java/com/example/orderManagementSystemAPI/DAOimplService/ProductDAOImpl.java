package com.example.orderManagementSystemAPI.DAOimplService;

import com.example.orderManagementSystemAPI.DAO.ProductDAO;
import com.example.orderManagementSystemAPI.model.Product;

public abstract class ProductDAOImpl implements  ProductDAO{
    private ProductDAO productDAO;

    @Override
    public Product createProduct(Product product) {
        return (Product) productDAO.save(product);
    }   
}
