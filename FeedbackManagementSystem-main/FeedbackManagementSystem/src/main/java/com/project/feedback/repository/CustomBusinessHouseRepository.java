package com.project.feedback.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.project.feedback.entity.BusinessHouse;

@Repository
public interface CustomBusinessHouseRepository {
	public List<BusinessHouse> searchByName(String businessName);

}
