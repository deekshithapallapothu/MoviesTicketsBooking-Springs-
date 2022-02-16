package com.cg.mts.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.mts.entities.Customers;
import com.cg.mts.entities.Events;

@Repository

public class CustomerRepositoryImpl implements CustomerRepository {
	List<Events> list=new ArrayList<>();

	@Autowired
	EntityManager entityManager;


	@Override
	public Customers getCustomerByName(String customerName) {
		Session session = entityManager.unwrap(Session.class);
		String queryString = "from Customers c where c.customerName=:customerName";
		Query<Customers> query = session.createQuery(queryString);
		query.setString("customerName", customerName);
		
		Customers customer = (Customers) query.getSingleResult();
		
		if(customer!= null)
		{
			return customer;
		}
		else
		{
			throw new javax.persistence.NoResultException("CustomerName is Not In The DB");
		}
	}

	}