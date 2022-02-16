package com.project.feedback.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.feedback.entity.Feedback;
@Repository
public interface IFeedbackRepository extends CrudRepository<Feedback, Integer>//,CustomFeedbackRepository 
{

}
