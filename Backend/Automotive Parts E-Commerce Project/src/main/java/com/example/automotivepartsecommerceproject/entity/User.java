package com.example.automotivepartsecommerceproject.entity;

import jakarta.persistence.*;
import lombok.*;


@Data
@Getter

@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name="user")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Setter
    @Column(name="first_name",length=30)
    private String firstName;
    @Setter
    @Column(name="last_name",length=30)
    private String lastName;
    @Setter
    @Column(name="password",length=30)
    private String password;
    @Setter
    @Column(name="email")
    private String email;
    @Setter
    @Column(name = "role")
    private String role;

    @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private User user;

}
