package com.cg.mts.repository;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.mts.entities.Customers;

@Repository
public interface CustomerRepository {
	public Customers getCustomerByName(String customerName);
	


}