package com.example.orderManagementSystemAPI.DAO;

import com.example.orderManagementSystemAPI.model.OrderLine;
import org.springframework.data.repository.CrudRepository;

public interface OrderLineDAO extends CrudRepository {
    public void ChangeQuantityOfProducts (OrderLine orderLine);


}
