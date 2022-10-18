package com.example.orderManagementSystemAPI.DAOimplService;

import com.example.orderManagementSystemAPI.DAO.OrderLineDAO;
import com.example.orderManagementSystemAPI.model.OrderLine;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public abstract class OrderLineImplService implements OrderLineDAO {
    EntityManager entityManager = null;
    @Override
    public void ChangeQuantityOfProducts(OrderLine orderLine){
        Query query = entityManager.createQuery("UPDATE OrderLine SET productQuentity= ?1")
                .setParameter(1,orderLine);
    }
}
