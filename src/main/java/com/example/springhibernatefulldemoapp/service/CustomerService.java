package com.example.springhibernatefulldemoapp.service;

import com.example.springhibernatefulldemoapp.entity.Customer;
import com.example.springhibernatefulldemoapp.repository.CustomerDAO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerService {

    private CustomerDAO customerDAO;

    public List<Customer> getCustomers() {
         return customerDAO.getCustomers();
    }
}
