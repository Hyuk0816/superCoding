package com.example.supercoding.Subject_Week4Day4.leadSubject;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class Order {
    private int id;
    private Optional<Customer> customer;
    private LocalDate orderDate;
    private OrderStatus status;
    private Optional<List<OrderItem>> orderItems;





    public Order(int id, Customer customer, LocalDate orderDate, OrderStatus status, List<OrderItem> orderItems) {
        this.id = id;
        this.customer = Optional.ofNullable(customer);
        this.orderDate = orderDate;
        this.status = status;
        this.orderItems = Optional.ofNullable(orderItems);
    }


    public Optional<Customer> getCustomer() {
        return customer;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public Optional<List<OrderItem>> getOrderItems() {
        return orderItems;
    }
}
