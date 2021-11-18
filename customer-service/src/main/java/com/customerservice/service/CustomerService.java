package com.customerservice.service;

import java.util.List;

import com.customerservice.model.Customer;

public interface CustomerService {

	public Customer createCustomer(Customer customer);
	public List<Customer> displayCustomerList();
}
