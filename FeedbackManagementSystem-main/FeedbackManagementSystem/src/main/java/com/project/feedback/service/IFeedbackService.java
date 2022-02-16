package com.project.feedback.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.feedback.entity.Feedback;
@Service
public interface IFeedbackService {
	public Feedback addFeedback(Feedback feedback);
	public boolean removeFeedabck(int feedbackId);
	//public List<Feedback> getFeedbacksOnBusinessHouse(int businessId);
	//public List<Feedback> getFeedbackOnProduct(int productId);
	

}