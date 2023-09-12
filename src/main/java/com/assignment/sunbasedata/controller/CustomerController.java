package com.assignment.sunbasedata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.assignment.sunbasedata.entity.Customer;
import com.assignment.sunbasedata.service.CustomerService;

@Controller

public class CustomerController {
    private CustomerService customerService;
	
	@Autowired
	public CustomerController(CustomerService theCustomerService){
		this.customerService = theCustomerService;

	}

	@GetMapping("/")
	public String listEmployees(Model theModel) {
		List<Customer> theCustomer = customerService.findAll();

		// add to the spring model
		theModel.addAttribute("customers", theCustomer);

		return "customers/list-customers";
	}
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel){

		// create model attribute to bind form data
		Customer theCustomer = new Customer();
		theModel.addAttribute("customers", theCustomer);
		return "customers/customer-form";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("id") int id, Model theModel){
		// get employee from the service
		Customer theCustomer = customerService.findById(id);
		 


		// set employee in the model to prepopulate the form
		theModel.addAttribute("customers", theCustomer);


		// send over to our form
		return "customers/customer-form";
	}

	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("customers") Customer theCustomer){
		// save the employee
		customerService.save(theCustomer);

		// use a redirect to prevent duplicate submission
		return "redirect:/";
	}

	@GetMapping("/delete")
	public String delete(@RequestParam("id") int theId){
		// delete the employee
		customerService.deleteById(theId);


		// redirect to the /employees/list
		return "redirect:/";
	}

	// @GetMapping("/showMyLoginPage")
    // public String showMyLoginPage(){
    //     //return "plain-login";
    //     return "auth/customer-login"; 
    // }

	// @GetMapping("/access-denied")
    // public String showAccessDenied(){
    //     return "auth/access-denied";
    // }
    
}
