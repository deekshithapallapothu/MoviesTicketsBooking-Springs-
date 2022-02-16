package com.project.feedback.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.feedback.entity.Product;

@Service
public interface IProductService {
	public Product addProduct(Product product);
	public boolean removeProduct(int productId);
	public List<Product> getAllProducts();
	//public List<Product> getproductInRange(int range1,int range2);

}
