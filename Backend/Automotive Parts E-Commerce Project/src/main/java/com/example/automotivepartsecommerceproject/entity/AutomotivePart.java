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
@Table(name="automotive_part")
public class AutomotivePart {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Setter
    @Column(name="name")
    private String name;
    @Setter
    @Column(name="part_no")
    private String partNo;
    @Setter
    @Column(name="brand")
    private String brand;
    @Setter
    @Column(name="model")
    private String model;
    @Setter
    @Column(name="year")
    private String year;
    @Setter
    @Column(name="attribute")
    private String attribute;
    @Setter
    @Column(name="definition")
    private String definition;
    @Setter
    @Column(name="price")
    private double price;
    @Setter
    @Column(name="quantity")
    private int quantity;
    @Setter
    @OneToMany(mappedBy = "automotivePart", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AutomotivePartImage> partImages = new ArrayList<>();
    public void addPartImage(AutomotivePartImage partImage) {
        partImages.add(partImage);
        partImage.setAutomotivePart(this);
    }
    public void removePartImage(AutomotivePartImage partImage) {
        partImages.remove(partImage);
        partImage.setAutomotivePart(null);
    }
}
