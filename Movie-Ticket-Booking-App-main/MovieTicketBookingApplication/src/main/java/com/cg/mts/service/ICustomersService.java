package com.cg.mts.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.mts.entities.Customers;

@Service
public interface ICustomersService {

	public Customers createCustomer(Customers customer);
	public List<Customers> getAllCustomers();
	public boolean removeCustomerById(int customerId);
	public Customers getCustomerById(int customerId);
	public Customers getCustomerByName(String customerName);
}
