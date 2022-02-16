package com.project.feedback.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.feedback.entity.BusinessHouse;


@Service
public interface IBusinessHouseService {
	public BusinessHouse addBuisnessHouse(BusinessHouse businessHouse);
	public boolean removeBuisnessHouse(int businessId);
	public List<BusinessHouse> getAllBusinessHouse();
	public List<BusinessHouse> getBusinessHouseOnLocation(String businessLocation);
	public List<BusinessHouse> getBusinessHouseOnProduct(String productName);
	//public List<BusinessHouse> searchByName(String businessName);

	

}