package com.cg.mts.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.mts.entities.Customers;

@Repository
public interface ICustomersRepository extends CrudRepository<Customers, Integer>,CustomerRepository{

}
