package com.example.springhibernatefulldemoapp.repository;

import com.example.springhibernatefulldemoapp.entity.Customer;

import java.util.List;

public interface CustomerDAO {

    List<Customer> getCustomers();
    void saveCustomer(Customer customer);

    Customer getCustomer(Integer id);

    void updateCustomer(Customer customer);

    void deleteCustomer(Integer id);
}
