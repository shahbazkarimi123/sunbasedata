package com.assignment.sunbasedata.service;

import java.util.List;

import com.assignment.sunbasedata.entity.Customer;

public interface CustomerService {

    List<Customer> findAll();
	
	Customer findById(int theId);
	
	void save(Customer theCustomer);
	
	void deleteById(int theId);
    
}
