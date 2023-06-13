package com.example.automotivepartsecommerceproject.dataAccess;

import com.example.automotivepartsecommerceproject.entity.Adress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdressDao extends JpaRepository<Adress,Integer> {
}
