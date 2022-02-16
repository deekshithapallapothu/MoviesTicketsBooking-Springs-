package com.project.feedback.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.feedback.entity.BusinessHouse;
import com.project.feedback.service.IBusinessHouseService;

@RestController
@RequestMapping("/app")
public class BusinessHouseWebController {
	@Autowired	
	IBusinessHouseService service;
	
	@PostMapping("/business")
	public boolean addBusinessHouse(@RequestBody BusinessHouse businesshouse){
		service.addBuisnessHouse(businesshouse);
		return true;
	}
	
	@DeleteMapping("/business/{businessId}")
	public boolean removeBusinessHouse(@PathVariable int businessId) {
		 return service.removeBuisnessHouse(businessId);
	}
	
	@GetMapping("/businesshouse")
	public List<BusinessHouse> getAllBusinessHouse(){
		return service.getAllBusinessHouse();
	}
	
	/*@GetMapping("/businessrating/{businessName}")
	public List<BusinessHouse> searchByName(@PathVariable String businessName){
		return service.searchByName(businessName);
	}*/
	

}
