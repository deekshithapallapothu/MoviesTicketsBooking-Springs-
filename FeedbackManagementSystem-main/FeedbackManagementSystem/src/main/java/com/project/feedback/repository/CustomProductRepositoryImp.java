package com.project.feedback.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.feedback.entity.BusinessHouse;
import com.project.feedback.entity.Product;

@Repository
public class CustomProductRepositoryImp implements CustomProductRepository {
	@Autowired
	EntityManager entityManager;
	@Override
	public List<Product> getproductInRange(int range1, int range2) {
		// TODO Auto-generated method stub
		Session session=entityManager.unwrap(Session.class);
		String queryString="from sprint.product where price>=:range1 and price<=:range2";
		Query<Product> query=(Query<Product>) session.createQuery(queryString);
		query.setInteger("range1", range1);
		query.setInteger("range2", range2);
		List<Product> list =query.getResultList();
		if(list != null)
		{
			return list;
		}
		else
		{
			throw new javax.persistence.NoResultException("No Product in Range");
		}

}
}