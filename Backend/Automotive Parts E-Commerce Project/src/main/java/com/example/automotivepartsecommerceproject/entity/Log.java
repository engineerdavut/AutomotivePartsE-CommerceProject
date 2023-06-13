package com.example.automotivepartsecommerceproject.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;


@Data
@Getter

@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name="log")
public class Log {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Setter
    @Column(name="message")
    private String message;
    @Setter
    @Column(name="exception")
    private String exception;
    @Setter
    @Enumerated(EnumType.ORDINAL)
    @Column(name="level")
    private Level level;
    @Setter
    @Enumerated(EnumType.ORDINAL)
    @Column(name="priority_type")
    private PriorityType priorityType;
    @Setter
    @Column(name="component")
    private String component;
    @Setter
    @CreatedDate
    @Column(name="created_at")
    private Date createdAt;
    @Setter
    @ManyToOne
    private User user;

}
