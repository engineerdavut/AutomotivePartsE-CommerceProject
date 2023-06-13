package com.example.automotivepartsecommerceproject.business.concretes;

import com.example.automotivepartsecommerceproject.business.abstracts.CustomerService;
import com.example.automotivepartsecommerceproject.dataAccess.CustomerDao;
import com.example.automotivepartsecommerceproject.entity.Admin;
import com.example.automotivepartsecommerceproject.entity.CreditCard;
import com.example.automotivepartsecommerceproject.entity.Customer;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerManager implements CustomerService {
    @Autowired
    private CustomerDao customerDao;
    @Transactional
    @Override
    public Customer add(Customer customer) {
        return customerDao.save(customer);
    }
    @Transactional
    @Override
    public Customer update(Customer customer) {
        return customerDao.save(customer);
    }
    @Transactional
    @Override
    public void delete(int id) {
        customerDao.deleteById(id);
    }

    @Override
    public boolean login(String email, String password) {
        Customer customer = customerDao.findByEmail(email).orElse(null);
        if (customer != null && customer.getPassword().equals(password)) {
            return true;
        }
        return false;
    }

    public void addCreditCardToCustomer(int id, CreditCard creditCard) {
        Customer customer = customerDao.findById(id).orElse(null);
        customer.addCreditCard(creditCard);
        customerDao.save(customer);
    }

    public void removeCreditCardFromCustomer(int id, CreditCard creditCard) {
        Customer customer = customerDao.findById(id).orElse(null);
        customer.removeCreditCard(creditCard);
        customerDao.save(customer);
    }
}
