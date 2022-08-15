package com.example.springhibernatefulldemoapp.service;

import com.example.springhibernatefulldemoapp.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getCustomers();

    void saveCustomer(Customer customer);

    Customer getCustomer(Integer id);

    void deleteCustomer(Integer id);
}
