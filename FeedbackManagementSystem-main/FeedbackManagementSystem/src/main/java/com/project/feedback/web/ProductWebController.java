package com.project.feedback.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.feedback.entity.Product;
import com.project.feedback.service.IProductService;

@RestController
@RequestMapping("/app")
public class ProductWebController {
	@Autowired	
	IProductService service;
	
	
	@PostMapping("/product")
	public boolean addProduct(@RequestBody Product product){
		service.addProduct(product);
		return true;
	}
	
	@DeleteMapping("/product/{productId}")
	public boolean removeProduct(@PathVariable int productId) {
		 return service.removeProduct(productId);
	}
	
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return service.getAllProducts();
	}
	/*@GetMapping("/product/{range1}/{range2}")
	public List<Product> getProductInRange(@PathVariable int range1,@PathVariable  int range2)
	{
		return service.getproductInRange(range1, range2);
	}
*/
}