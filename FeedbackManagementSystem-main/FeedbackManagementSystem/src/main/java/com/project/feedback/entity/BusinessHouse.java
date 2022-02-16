package com.project.feedback.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class BusinessHouse {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int businessId;
	@NotNull(message = "businessCategory should not be empty")
	private String businessName;
	private String businessCategory;
	private String businessLocation;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="business_house_products",
                joinColumns=@JoinColumn(name="businesshousedetails"),
                inverseJoinColumns=@JoinColumn(name="productdetails"))
	private List<Product> products;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="business_house_feedback",
	             joinColumns=@JoinColumn(name="businesshousedetails"),
	             inverseJoinColumns=@JoinColumn(name="feedbackdetails"))
	private List<Feedback> feedback;
	private float avgRating;
	
	
	public BusinessHouse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBusinessId() {
		return businessId;
	}
	public void setBusinessId(int businessId) {
		this.businessId = businessId;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getBusinessCategory() {
		return businessCategory;
	}
	public void setBusinessCategory(String businessCategory) {
		this.businessCategory = businessCategory;
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
