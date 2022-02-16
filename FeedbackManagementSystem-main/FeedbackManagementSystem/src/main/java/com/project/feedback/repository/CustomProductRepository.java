package com.project.feedback.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.project.feedback.entity.Product;

@Repository
public interface CustomProductRepository {

	public List<Product> getproductInRange(int range1,int range2);
	
}

