package com.example.orderManagementSystemAPI.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="ORDER")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int orderId;
    @Column(nullable = false, length = 100)
    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
    private Customer customer;
    @Column(nullable = false, length = 100)
    private Date dateOfSubmission;
    @Column(nullable = false, length = 100)
    private OrderLine orderLineId;

    public Order(int orderId, Customer customer, Date dateOfSubmission, OrderLine orderLineId) {
        this.orderId = orderId;
        this.customer = customer;
        this.dateOfSubmission = dateOfSubmission;
        this.orderLineId = orderLineId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getDateOfSubmission() {
        return dateOfSubmission;
    }

    public void setDateOfSubmission(Date dateOfSubmission) {
        this.dateOfSubmission = dateOfSubmission;
    }

    public OrderLine getOrderLineId() {
        return orderLineId;
    }

    public void setOrderLineId(OrderLine orderLineId) {
        this.orderLineId = orderLineId;
    }
}
