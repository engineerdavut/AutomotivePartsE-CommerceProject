package com.example.automotivepartsecommerceproject.business.concretes;

import com.example.automotivepartsecommerceproject.business.abstracts.CargoService;
import com.example.automotivepartsecommerceproject.entity.Cargo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CargoManager implements CargoService {
    @Override
    public Cargo add(Cargo cargo) {
        return null;
    }

    @Override
    public Cargo update(Cargo cargo) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Cargo get(int id) {
        return null;
    }

    @Override
    public List<Cargo> getByCustomer() {
        return null;
    }

    @Override
    public List<Cargo> getByState() {
        return null;
    }
}
