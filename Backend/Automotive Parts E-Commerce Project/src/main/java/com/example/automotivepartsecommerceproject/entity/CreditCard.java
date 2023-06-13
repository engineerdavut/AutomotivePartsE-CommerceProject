package com.example.automotivepartsecommerceproject.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Getter

@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name="credit_cart")
public class CreditCard {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Setter
    @Column(name="card_name")
    private String cardName;
    @Setter
    @Column(name="card_owner")
    private String cardOwner;
    @Setter
    @Column(name="card_number")
    private String cardNumber;
    @Setter
    @Column(name="card_expiration_month")
    private String cardExpirationMonth;
    @Setter
    @Column(name="card_expiration_year")
    private String cardExpirationYear;
    @Setter
    @Column(name="card_cvv_or_cvc_code")
    private String cardCvvOrCvcCode;
    @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Customer customer;

}
