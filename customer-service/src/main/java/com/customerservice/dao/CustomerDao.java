package com.customerservice.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.customerservice.model.Customer;

@Repository
public interface CustomerDao extends MongoRepository<Customer,String> {

}
