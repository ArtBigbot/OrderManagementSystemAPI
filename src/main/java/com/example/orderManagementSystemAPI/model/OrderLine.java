package com.example.orderManagementSystemAPI.model;

import javax.persistence.*;

@Entity
@Table(name="OrderLine")
public class OrderLine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int orderLineId;
    @Column(nullable = false, length = 100)
    private int productQuentity;
    @OneToOne(mappedBy = "orderline", cascade = CascadeType.ALL)
    private Order order;

    public OrderLine(int orderLineId, int productQuentity, Order order) {
        this.orderLineId = orderLineId;
        this.productQuentity = productQuentity;
        this.order=order;
    }

    public int getOrderLineId() {
        return orderLineId;
    }

    public void setOrderLineId(int orderLineId) {
        this.orderLineId = orderLineId;
    }

    public int getProductQuentity() {
        return productQuentity;
    }

    public void setProductQuentity(int productQuentity) {
        this.productQuentity = productQuentity;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
