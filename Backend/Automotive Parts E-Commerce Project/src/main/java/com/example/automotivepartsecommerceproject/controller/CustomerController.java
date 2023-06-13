package com.example.automotivepartsecommerceproject.controller;

import com.example.automotivepartsecommerceproject.business.concretes.AdminManager;
import com.example.automotivepartsecommerceproject.business.concretes.CustomerManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    @Autowired
    private CustomerManager customerManager;
}
