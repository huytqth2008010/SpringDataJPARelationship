package com.example.springdatajparelationship.product.entity;


import com.example.springdatajparelationship.category.entity.Category;
import com.example.springdatajparelationship.order.entity.OrderDetail;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    //Gia tri tu tang
    private int id;

    //    @Column(name = "name", columnDefinition = "varchar(250)")
    private String name;
    private String description;
    private Double price;
    private int categoryId;

    @ManyToOne
    @JoinColumn(name = "categoryId", insertable = false, updatable = false)
    @JsonIgnore
    private Category category;

    private int status;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private Set<OrderDetail> orderDetailSet;

}
