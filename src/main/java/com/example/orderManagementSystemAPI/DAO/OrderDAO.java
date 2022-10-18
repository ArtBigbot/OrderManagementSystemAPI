package com.example.orderManagementSystemAPI.DAO;

import com.example.orderManagementSystemAPI.model.Customer;
import com.example.orderManagementSystemAPI.model.Order;
import com.example.orderManagementSystemAPI.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface OrderDAO extends CrudRepository {
    public Order createOrder (Order order);
    public  List<Order> searchAllOrdersByDate(Date date);
    public List<Order> searchOrdersByProduct(Product product);
    List<Order> searchOrdersByCustomer(Customer customer);
}
