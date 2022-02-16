package com.project.feedback.customsort;

import java.util.Comparator;

import com.project.feedback.entity.Product;

public class ByPrice implements Comparator<Product> {

	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		if( o1.getProductPrice()==o2.getProductPrice())
			return 0;
		else if(o1.getProductPrice()>o2.getProductPrice())
			return 1;
		else
			return -1;
	}
}