package com.example.automotivepartsecommerceproject.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Getter

@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name="basket_item")
public class BasketItem {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Setter
    @Column(name="quantity")
    private int quantity;
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
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Basket basket;
    @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private AutomotivePart automotivePart;
}
