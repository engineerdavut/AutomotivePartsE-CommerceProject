package com.example.automotivepartsecommerceproject.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Getter

@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name="basket")
public class Basket {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
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
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    @Column(name="create_date")
    private Date createDate;
    @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private User user;

    @OneToMany(mappedBy = "basket", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BasketItem> items = new ArrayList<>();

    public void addItem(BasketItem item) {
        items.add(item);
        item.setBasket(this);
    }

    public void removeItem(BasketItem item) {
        items.remove(item);
        item.setBasket(null);
    }
}
