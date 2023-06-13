package com.example.automotivepartsecommerceproject.business.abstracts;

import com.example.automotivepartsecommerceproject.entity.Admin;
import com.example.automotivepartsecommerceproject.entity.CreditCard;
import com.example.automotivepartsecommerceproject.entity.Customer;

import java.util.List;

public interface CustomerService {
    Customer add(Customer customer);
    Customer update(Customer customer);
    void delete(int id);
    boolean login(String email,String password);

    void addCreditCardToCustomer(int id, CreditCard creditCard);
    void removeCreditCardFromCustomer(int id, CreditCard creditCard);
}
