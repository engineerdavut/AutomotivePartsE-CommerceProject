package com.example.automotivepartsecommerceproject.dataAccess;

import com.example.automotivepartsecommerceproject.entity.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargoDao extends JpaRepository<Cargo,Integer> {
}
