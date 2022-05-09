package com.example.springdatajparelationship.order.entity;

import com.example.springdatajparelationship.order.api.OrderDetailId;
import com.example.springdatajparelationship.product.entity.Product;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders_details")
public class OrderDetail {
    @EmbeddedId
    private OrderDetailId id;

    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "product_id")
    private Product product;
    // thông tin thêm.

    private int quantity;
    private Double unitPrice;

}