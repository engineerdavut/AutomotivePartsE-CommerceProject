package com.example.automotivepartsecommerceproject.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Getter

@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name="customer")
public class Customer extends User{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Setter
    @Getter
    @Column(name="status")
    private boolean status;
    @Setter
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<CreditCard> creditCards;

    public void addCreditCard(CreditCard creditCard) {
        creditCards.add(creditCard);
        creditCard.setCustomer(this);
    }

    public void removeCreditCard(CreditCard creditCard) {
        creditCards.remove(creditCard);
        creditCard.setCustomer(null);
    }
}
