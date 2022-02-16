package com.project.feedback.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

@Entity
public class Feedback {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int feedbackId;
	@Size(min=5)
	private String username;
	@Range(min=1,max=5)
	private int rating;
	@NotNull(message = "Comments should not be empty")
	private String comments;
	@NotNull(message = "Date cannot be null")
	private LocalDate date;
	
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	


}
