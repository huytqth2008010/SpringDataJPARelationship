package com.example.springdatajparelationship.order.service;


import com.example.springdatajparelationship.order.entity.Order;
import com.example.springdatajparelationship.order.model.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public Order save(Order grade){
        orderRepository.save(grade);
        return grade;
    }

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Optional<Order> findById(int orderId) {
        return orderRepository.findById(orderId);
    }
    public void deleteById(Integer id) {
        orderRepository.deleteById(id);
    }
}

