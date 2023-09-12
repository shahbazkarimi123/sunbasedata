package com.assignment.sunbasedata.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.sunbasedata.entity.Customer;
import com.assignment.sunbasedata.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerRest {
    CustomerService customerService;
    @Autowired
    public CustomerRest(CustomerService theCustomerService){
        this.customerService = theCustomerService;

    }
    @GetMapping("/list")
    public List<Customer> customerList(){
        List<Customer> customers = customerService.findAll();
        return customers;
    }
    @PostMapping("/{id}")
    public Customer customerById(@PathVariable("id") int id){
        Customer theCustomer = customerService.findById(id);
        return theCustomer;
    }
    
}
