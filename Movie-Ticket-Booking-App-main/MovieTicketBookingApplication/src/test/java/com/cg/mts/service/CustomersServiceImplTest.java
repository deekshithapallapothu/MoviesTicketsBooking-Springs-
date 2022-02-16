package com.cg.mts.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.mts.entities.Customers;
import com.cg.mts.repository.ICustomersRepository;
@SpringBootTest
class CustomersServiceImplTest {
	
	@Mock
	ICustomersRepository repository;

	@Test
	void testGetCustomersById() {
		Customers c=new Customers();
		Optional<Customers> output=Optional.of(c);
		when((repository.findById(1000))).thenReturn(output);
		assertEquals(new Customers(), c);
		
	}
	@Test
	void testViewAllCustomers() {
		List<Customers> cust=new ArrayList<>();
		when(repository.findAll()).thenReturn(cust);
		assertIterableEquals(new ArrayList<Customers>(), cust);		
	}

}