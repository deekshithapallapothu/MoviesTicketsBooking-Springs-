package com.project.feedback.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.feedback.entity.BusinessHouse;
import com.project.feedback.entity.Feedback;

@Repository
public class CustomFeedbackRepositoryImp implements CustomFeedbackRepository {

	@Autowired
	EntityManager entityManager;
	
	@Override
	public List<Feedback> getFeedbackByBusinessHouse(int businessHouseId) {
		// TODO Auto-generated method stub
		Session session=entityManager.unwrap(Session.class);
		String queryString="from sprint.business_house_feedback where business_house_business_id=:businessHouseId";
		Query<Feedback> query=(Query<Feedback>) session.createQuery(queryString);
		query.setInteger("businessHouseId", businessHouseId);
		List<Feedback> list =query.getResultList();
		if(list != null)
		{
			return list;
		}
		else
		{
			throw new javax.persistence.NoResultException("Business Feedback  not in DB");
		}
	
	}

	@Override
	public List<Feedback> getFeedbackByProduct(int productId) {
		// TODO Auto-generated method stub
		Session session=entityManager.unwrap(Session.class);
		String queryString="from sprint.product_feedback where product_product_id=:productId";
		Query<Feedback> query=(Query<Feedback>) session.createQuery(queryString);
		query.setInteger("productId", productId);
		List<Feedback> list =query.getResultList();
		if(list != null)
		{
			return list;
		}
		else
		{
			throw new javax.persistence.NoResultException("Product Feedback not in DB");
		}
	}

}
