package com.project.feedback.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

import com.project.feedback.entity.Feedback;
import com.project.feedback.entity.Product;

public class BusinessHouseDTO {
	private String businessName;
	private String businessLocation;
	@OneToMany(cascade=CascadeType.ALL)
	private List<Product> products;
	@OneToMany(cascade=CascadeType.ALL)
	private List<Feedback> feedback;
	private float avgRating;
	public BusinessHouseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BusinessHouseDTO(String businessName, String businessLocation, float avgRating) {
		super();
		this.businessName = businessName;
		this.businessLocation = businessLocation;
		this.avgRating = avgRating;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getBusinessLocation() {
		return businessLocation;
	}
	public void setBusinessLocation(String businessLocation) {
		this.businessLocation = businessLocation;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public List<Feedback> getFeedback() {
		return feedback;
	}
	public void setFeedback(List<Feedback> feedback) {
		this.feedback = feedback;
	}
	public float getAvgRating() {
		return avgRating;
	}
	public void setAvgRating(float avgRating) {
		this.avgRating = avgRating;
	}
	
	

}
