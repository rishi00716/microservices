package com.customerservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.customerservice.model.Customer;
import com.customerservice.service.CustomerService;

@RestController
public class CustomerController {

	private CustomerService customerService;

	@Autowired
	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	
	@PostMapping("/customers")
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer){
		return ResponseEntity.status(HttpStatus.CREATED).body(customerService.createCustomer(customer));
	}
	
	@GetMapping("/customers")
	public ResponseEntity<List<Customer>> displayCustomerList(){
		return ResponseEntity.ok(customerService.displayCustomerList());
	}
}
