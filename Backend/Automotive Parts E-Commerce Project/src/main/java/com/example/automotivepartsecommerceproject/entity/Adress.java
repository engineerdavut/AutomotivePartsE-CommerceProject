package com.example.automotivepartsecommerceproject.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Getter

@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name="admin")
public class Adress {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Setter
    @Column(name="adress_name")
    private String adressName;
    @Setter
    @Column(name="city")
    private String city;
    @Setter
    @Column(name="definition")
    private String definition;
    @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Customer customer;
}
