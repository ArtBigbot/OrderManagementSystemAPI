package com.example.orderManagementSystemAPI.DAOimplService;

import com.example.orderManagementSystemAPI.DAO.OrderDAO;
import com.example.orderManagementSystemAPI.model.Customer;
import com.example.orderManagementSystemAPI.model.Order;
import com.example.orderManagementSystemAPI.model.Product;

import javax.persistence.EntityManager;
import java.util.Date;
import java.util.List;

public  abstract class OrderDAOImplService implements OrderDAO {
    private OrderDAO orderDAO;
    EntityManager entityManager = null;

    public OrderDAOImplService() {
    }

    @Override
    public Order createOrder(Order order) {
        return (Order) orderDAO.save(order);
    }

    @Override
    public  List<Order> searchAllOrdersByDate(Date date) {

        List<Order> orders = entityManager.createQuery("SELECT order from ORDER order where order.dateOfSubmission = ?1")
                .setParameter(1,date)
                .getResultList();
        if (orders.size()>0)
        {
            return orders;
        }
        else
        {
            return null;
        }

    }

    @Override
    public List<Order> searchOrdersByProduct(Product product) {
        List <Order> orders = entityManager.createQuery("SELECT order FROM PRODUCT product WHERE product.order =?1")
                .setParameter(1,product)
                .getResultList();
        if(orders.size()>0)
        {
            return orders;
        }
        else
        {
            return null ;
        }

    }


    @Override
    public List<Order> searchOrdersByCustomer(Customer customer) {
        List <Order> orders = entityManager.createQuery("SELECT order FROM ORDER order WHERE order.customer = ?1")
                .setParameter(1,customer)
                .getResultList();

        if (orders.size()>0)
        {
            return orders;
        }
        else
        {
            return null;
        }
    }

}
