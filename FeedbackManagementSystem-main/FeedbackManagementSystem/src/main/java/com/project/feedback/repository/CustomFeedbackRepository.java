package com.project.feedback.repository;

import java.util.List;

import org.springframework.stereotype.Repository;


import com.project.feedback.entity.Feedback;

@Repository
public interface CustomFeedbackRepository {
	public List<Feedback> getFeedbackByBusinessHouse(int businessHouseId);
	public List<Feedback> getFeedbackByProduct(int productId);

}