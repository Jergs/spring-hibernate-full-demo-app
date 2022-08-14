package com.example.springhibernatefulldemoapp.controller;

import com.example.springhibernatefulldemoapp.entity.Customer;
import com.example.springhibernatefulldemoapp.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer")
@AllArgsConstructor
public class CustomerController {

    private CustomerService customerService;

    @RequestMapping("/list")
    public String listCustomers(Model model) {

        List<Customer> customerList = customerService.getCustomers();
        model.addAttribute("customers", customerList);
        return "list-customers";
    }
}
