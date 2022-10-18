package com.example.orderManagementSystemAPI.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="CUSTOMER")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerId;
    @Column(nullable = false, length = 100)
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Order> order;
    @Column(nullable = false, length = 100)
    private int registrtionCode;
    @Column(nullable = false, length = 100)
    private String firstName;
    @Column(nullable = false, length = 100)
    private String lastName;
    @Column(nullable = false, length = 100)
    private String email;
    @Column(nullable = false, length = 100)
    private String telephone;

    protected  Customer (){}
    public Customer(int customerId, List<Order> order, int registrtionCode, String firstName, String lastName, String email, String telephone) {
        this.customerId = customerId;
        this.order = order;
        this.registrtionCode = registrtionCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.telephone = telephone;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public List <Order> getOrder() {
        return order;
    }

    public void setOrder(List <Order> order) {
        this.order = order;
    }

    public int getRegistrtionCode() {
        return registrtionCode;
    }

    public void setRegistrtionCode(int registrtionCode) {
        this.registrtionCode = registrtionCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
