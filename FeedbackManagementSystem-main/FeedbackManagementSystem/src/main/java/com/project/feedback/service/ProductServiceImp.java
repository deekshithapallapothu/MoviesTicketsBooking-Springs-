package com.project.feedback.service;

import java.util.List;

import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.feedback.entity.Product;
import com.project.feedback.repository.IBusinessHouseRepository;
import com.project.feedback.repository.IProductRepository;

@Service
public class ProductServiceImp implements IProductService{
	@Autowired
	IProductRepository repository;
	
	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		
		return repository.save(product);
	}

	@Override
	public boolean removeProduct(int productId) {
		// TODO Auto-generated method stub
		repository.deleteById(productId);
		return true;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		List<Product> list=(List<Product>) repository.findAll();
		return list;
	}

	/*@Override
	public List<Product> getproductInRange(int range1, int range2) {
		// TODO Auto-generated method stub
		
		return repository.getproductInRange(range1, range2);
	}*/
}
