package com.example.springdatajparelationship.order.model;

import com.example.springdatajparelationship.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
