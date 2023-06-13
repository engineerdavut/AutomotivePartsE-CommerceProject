package com.example.automotivepartsecommerceproject.business.abstracts;

import com.example.automotivepartsecommerceproject.entity.Admin;
import com.example.automotivepartsecommerceproject.entity.Cargo;

import java.util.List;

public interface CargoService {
    Cargo add(Cargo cargo);
    Cargo update(Cargo cargo);
    void delete(int id);
    Cargo get(int id);
    List<Cargo> getByCustomer();
    List<Cargo> getByState();

}
