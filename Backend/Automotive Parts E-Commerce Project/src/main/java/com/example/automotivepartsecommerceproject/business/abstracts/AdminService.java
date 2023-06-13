package com.example.automotivepartsecommerceproject.business.abstracts;

import com.example.automotivepartsecommerceproject.entity.Admin;

import java.util.List;

public interface AdminService {

    Admin add(Admin admin);
    Admin update(Admin admin);
    void delete(int id);
    Admin get(int id);
    List<Admin> getAll();
    boolean login(String email,String password);
    void changeUserStatus(int id);
}
