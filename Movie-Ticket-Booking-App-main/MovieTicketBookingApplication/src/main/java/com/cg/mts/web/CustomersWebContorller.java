package com.cg.mts.web;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.mts.dto.EventsInfoDTO;
import com.cg.mts.dto.EventsSavePostDTO;
import com.cg.mts.dto.MoviesInfoDTO;
import com.cg.mts.dto.MoviesSavePostDTO;
import com.cg.mts.entities.Customers;
import com.cg.mts.service.ICustomersService;

@RestController
@RequestMapping("/app")
public class CustomersWebContorller {

	@Autowired
	ICustomersService service;
	

	@GetMapping("/getcustomer/{customerId}")
	public Customers getCustomerById(@PathVariable int customerId)
	{
		return service.getCustomerById(customerId);
	}
	@PostMapping("/addcustomer") 
	public boolean createCustomer(@RequestBody Customers c) 
	{
		service.createCustomer(c);
		return true;
	}
	@DeleteMapping("/customer/{customerId}")
	public boolean removeCustomer(@PathVariable int customerId) {
		return service.removeCustomerById(customerId);
	}
	@GetMapping("/customers")
	public List<Customers> listCustomers()
	{
		return service.getAllCustomers();
	}
  
}
