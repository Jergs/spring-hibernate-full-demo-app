package com.example.springhibernatefulldemoapp.controller;

import com.example.springhibernatefulldemoapp.entity.Customer;
import com.example.springhibernatefulldemoapp.service.CustomerServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/customer")
@AllArgsConstructor
public class CustomerController {

    private CustomerServiceImpl customerService;

    @GetMapping("/list")
    public String listCustomers(Model model) {
        List<Customer> customerList = customerService.getCustomers();
        model.addAttribute("customers", customerList);
        return "list-customers";
    }

    @GetMapping("showFormForAdd")
    public String showFormForAdd(Model model) {
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "customer-form";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("customerId") Integer id, Model model) {
        Customer customer = customerService.getCustomer(id);
        model.addAttribute("customer", customer);
        return "update-customer-form";
    }

    @PostMapping("/updateCustomer")
    public String updateCustomer(@ModelAttribute(name = "customer") Customer customer) {
        customerService.updateCustomer(customer);
        return "redirect:/customer/list";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute(name = "customer") Customer customer) {
        customerService.saveCustomer(customer);
        return "redirect:/customer/list";
    }

    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam("customerId") Integer id, Model model) {
        customerService.deleteCustomer(id);
        return "redirect:/customer/list";
    }
}
