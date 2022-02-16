package com.project.feedback.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.BasicQueryContract;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.feedback.entity.BusinessHouse;

@Repository
public class CustomBusinessHouseRepositoryImp implements CustomBusinessHouseRepository{
	@Autowired
	EntityManager entityManager;
	
	@Override
	public List<BusinessHouse> searchByName(String businessName) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		String queryString = "from BusinessHouse b where b.businessName LIKE :businessName";
		Query<BusinessHouse> query = (Query<BusinessHouse>) session.createQuery(queryString);
		query.setString("businessName", businessName);
		
		List<BusinessHouse>  list = (List<BusinessHouse>) query.getResultList();
		
		if(list != null)
		{
			return list;
		}
		else
		{
			throw new javax.persistence.NoResultException("Event Genre is Not In The DB");
		}
	}

}
