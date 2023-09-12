package com.assignment.sunbasedata.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.assignment.sunbasedata.entity.Customer;


public interface CustomerRepository extends JpaRepository<Customer,Integer>{
    public List<Customer> findAllByOrderByLastNameAsc();


    
}
