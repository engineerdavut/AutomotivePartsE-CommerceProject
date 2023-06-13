package com.example.automotivepartsecommerceproject.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Getter

@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name="cargo")
public class Cargo {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Setter
    @Column(name="cargo_state_code")
    private String cargoStateCode;
    @Setter
    @Column(name="cargo_state")
    private String cargoState;
    @Setter
    @Column(name="cargo_company")
    private String cargoCompany;

}
