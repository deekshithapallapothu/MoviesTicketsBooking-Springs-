package com.project.feedback.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.feedback.entity.BusinessHouse;
import com.project.feedback.entity.Product;

@Repository
public interface IProductRepository extends CrudRepository<Product, Integer>//,CustomProductRepository
{

}
