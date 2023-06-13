package com.example.automotivepartsecommerceproject.dataAccess;

import com.example.automotivepartsecommerceproject.entity.Admin;
import com.example.automotivepartsecommerceproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminDao extends JpaRepository<Admin,Integer> {
    Optional<Admin> findByEmail(String email);
}
