package com.example.automotivepartsecommerceproject.dataAccess;

import com.example.automotivepartsecommerceproject.entity.AutomotivePart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutomotivePartDao extends JpaRepository<AutomotivePart,Integer> {
}
