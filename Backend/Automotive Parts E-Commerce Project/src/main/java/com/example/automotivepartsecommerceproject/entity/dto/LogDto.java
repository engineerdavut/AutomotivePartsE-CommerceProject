package com.example.automotivepartsecommerceproject.entity.dto;

import com.example.automotivepartsecommerceproject.entity.Level;
import com.example.automotivepartsecommerceproject.entity.PriorityType;
import com.example.automotivepartsecommerceproject.entity.User;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LogDto {
    private int id;

    private String message;

    private String exception;

    private String level;

    private String priorityType;

    private String component;

    private Date createdAt;

}
