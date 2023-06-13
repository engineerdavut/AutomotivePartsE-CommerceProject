package com.example.automotivepartsecommerceproject.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Getter

@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name="order_item")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Setter
    @Column(name="price")
    private double price;
    @Setter
    @Column(name="discount")
    private double discount;
    @Setter
    @Column(name="total_price")
    private double totalPrice;
    @Setter
    @Column(name="quantity")
    private int quantity;
    @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Order order;
    @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private AutomotivePart automotivePart;


}
