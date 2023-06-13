package com.example.automotivepartsecommerceproject.business.concretes;

import com.example.automotivepartsecommerceproject.business.abstracts.AdminService;
import com.example.automotivepartsecommerceproject.dataAccess.AdminDao;
import com.example.automotivepartsecommerceproject.dataAccess.UserDao;
import com.example.automotivepartsecommerceproject.entity.Admin;
import com.example.automotivepartsecommerceproject.entity.Customer;
import com.example.automotivepartsecommerceproject.entity.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springfox.documentation.swagger2.mappers.ModelMapper;

import java.util.List;

@Service
public class AdminManager implements AdminService {
    @Autowired
    private AdminDao adminDao;
    @Autowired
    private UserDao userDao;

    @Autowired
    private ModelMapper modelMapper;
    @Transactional
    public Admin add(Admin admin) {
        return adminDao.save(admin);
    }

    public Admin get(int id) {
        return adminDao.findById(id).orElse(null);
    }

    @Override
    public List<Admin> getAll() {
        return adminDao.findAll();
    }
    @Transactional
    public Admin update(Admin admin) {
        return adminDao.save(admin);
    }
    @Transactional
    public void delete(int id) {
        adminDao.deleteById(id);
    }
    public boolean login(String email, String password) {
        Admin admin = adminDao.findByEmail(email).orElse(null);
        if (admin != null && admin.getPassword().equals(password)) {
            return true;
        }
        return false;
    }
    public void changeUserStatus(int id) {
        User user = userDao.findById(id).orElse(null);
        if (user != null) {
            if (user instanceof Customer) {
                Customer customer = (Customer) user;
                customer.setStatus(!customer.isStatus());
                userDao.save(customer);
            }
        }
    }
}
