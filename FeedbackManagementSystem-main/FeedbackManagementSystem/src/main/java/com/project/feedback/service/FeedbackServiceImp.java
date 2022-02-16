package com.project.feedback.service;

import java.util.List;

import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.feedback.entity.Feedback;
import com.project.feedback.repository.IFeedbackRepository;

@Service
public class FeedbackServiceImp implements IFeedbackService {

	@Autowired
	IFeedbackRepository repository;
	@Override
	public Feedback addFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		return repository.save(feedback);
	}

	@Override
	public boolean removeFeedabck(int feedbackId) {
		// TODO Auto-generated method stub
		repository.deleteById(feedbackId);
		return true;
	}

	/*@Override
	public List<Feedback> getFeedbacksOnBusinessHouse(int businessId) {
		// TODO Auto-generated method stub
		return repository.getFeedbackByBusinessHouse(businessId);
	}

	@Override
	public List<Feedback> getFeedbackOnProduct(int productId) {
		// TODO Auto-generated method stub
		return repository.getFeedbackByProduct(productId);
		
	}*/

}
