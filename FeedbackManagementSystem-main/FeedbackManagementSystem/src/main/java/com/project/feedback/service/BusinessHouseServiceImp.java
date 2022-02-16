package com.project.feedback.service;

import java.util.List;

import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.feedback.entity.BusinessHouse;
import com.project.feedback.repository.IBusinessHouseRepository;

@Service
public class BusinessHouseServiceImp implements IBusinessHouseService{
	@Autowired 
	IBusinessHouseRepository repository;
	
	@Override
	@Transactional
	public BusinessHouse addBuisnessHouse(BusinessHouse businessHouse) {
		// TODO Auto-generated method stub
		
		return repository.save(businessHouse);
	}

	@Override
	@Transactional
	public boolean removeBuisnessHouse(int businessId) {
		// TODO Auto-generated method stub
		repository.deleteById(businessId);
		return true;
	}

	@Override
	public List<BusinessHouse> getAllBusinessHouse() {
		// TODO Auto-generated method stub
		List<BusinessHouse> list=(List<BusinessHouse>) repository.findAll();
		return list;
	}

	@Override
	public List<BusinessHouse> getBusinessHouseOnLocation(String businessLocation) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public List<BusinessHouse> getBusinessHouseOnProduct(String productName) {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Override
	public List<BusinessHouse> searchByName(String businessName) {
		// TODO Auto-generated method stub
		return repository.searchByName(businessName);
	}
*/
	

}
