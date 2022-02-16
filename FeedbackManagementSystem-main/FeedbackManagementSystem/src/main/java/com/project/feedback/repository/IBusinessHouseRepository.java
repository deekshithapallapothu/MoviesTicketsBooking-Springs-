package com.project.feedback.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.feedback.entity.BusinessHouse;

@Repository
public interface IBusinessHouseRepository extends CrudRepository<BusinessHouse, Integer>//,CustomBusinessHouseRepository 
{

}
