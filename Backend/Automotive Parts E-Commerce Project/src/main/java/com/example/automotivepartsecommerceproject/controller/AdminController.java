package com.example.automotivepartsecommerceproject.controller;

import com.example.automotivepartsecommerceproject.business.concretes.AdminManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
    @Autowired
    private AdminManager adminManager;
}
