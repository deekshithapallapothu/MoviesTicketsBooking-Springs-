package com.project.feedback.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.feedback.entity.Feedback;
import com.project.feedback.service.IFeedbackService;

@RestController
@RequestMapping("/app")
public class FeedbackWebController {
	@Autowired
	IFeedbackService service;
	
	@PostMapping("/feedback")
	public boolean addFeedback(@RequestBody Feedback feedback)
	{
		service.addFeedback(feedback);
		return true;
	}
	@DeleteMapping("/feedback/{feedbackId}")
	public boolean removeFeedback(@PathVariable int feedbackId) {
		 return service.removeFeedabck(feedbackId);
	}
	/*@GetMapping("/feedabck/{businessId}")
	public List<Feedback> getFeedbackOnBusinessHouse(@PathVariable int businessId)
	{
		return service.getFeedbacksOnBusinessHouse(businessId);
	}
	@GetMapping("/feedabck/{feedbackId}")
	public List<Feedback> getFeedbackOnProduct(@PathVariable int feedbackId)
	{
		return service.getFeedbackOnProduct(feedbackId);
	}
	
 */
}
