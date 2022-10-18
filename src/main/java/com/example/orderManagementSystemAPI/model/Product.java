package com.example.orderManagementSystemAPI.model;

import javax.persistence.*;

@Entity
@Table(name="PRODUCT")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productId;
    @Column(nullable = false, length = 100)
    private String productName;
    @Column(nullable = false, length = 100)
    private String skuCode;
    @Column(nullable = false, length = 100)
    private int unitPrice;
    @Column(nullable = false, length = 100)
    private Order order;

    public Product(int productId, String productName, String skuCode, int unitPrice, Order order) {
        this.productId = productId;
        this.productName = productName;
        this.skuCode = skuCode;
        this.unitPrice = unitPrice;
        this.order = order;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
