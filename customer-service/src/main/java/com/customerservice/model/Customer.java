package com.customerservice.model;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Customer {
	
	@Id
	private String customerId;
	
	private String firstName;
	private String lastName;
	private String email;
}
