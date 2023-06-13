package com.example.automotivepartsecommerceproject.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@Getter

@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name="automotive_part_image")
public class AutomotivePartImage {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Setter
    @Column(name="image_path")
    private String imagePath;
    @Setter
    @Column(name="tag")
    private String tag;
    @Setter
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    @Column(name="create_date")
    private Date createDate;
    @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private AutomotivePart automotivePart;

}
