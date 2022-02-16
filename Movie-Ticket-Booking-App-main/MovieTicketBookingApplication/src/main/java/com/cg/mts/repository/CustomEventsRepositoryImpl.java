package com.cg.mts.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import com.cg.mts.entities.Events;
import com.cg.mts.entities.Theaters;

@Repository
public class CustomEventsRepositoryImpl implements CustomEventsRepository {

	List<Events> list=new ArrayList<>();
	@Autowired
	EntityManager entityManager;
	@Override
	public List<Events> getEventsByGenre(String eventGenre,String theatreCity) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		String queryString = "from Events e where e.eventGenre=:eventGenre";
		Query<Events> query = session.createQuery(queryString);
		query.setString("eventGenre", eventGenre);
		
		List<Events>  events = (List<Events>) query.getResultList();
		List<Events> finalEvents = new ArrayList<Events>();
		if(list != null)
		{
			for (Events event : events) {
				List<Theaters> theaters = event.getTheaters();
				List<Theaters> locationTheaters = new ArrayList<Theaters>();
				for (Theaters theater : theaters) {
					String location = theater.getTheatreCity();
					if(location.equalsIgnoreCase(theatreCity))
					{
						locationTheaters.add(theater);
					}
				}
				if(locationTheaters.size()!=0)
				{
					event.setTheaters(locationTheaters);
					finalEvents.add(event);
				}
			}
			return finalEvents;
		}
		else
		{
			throw new javax.persistence.NoResultException("Event Genre is Not In The DB");
		}
	}

	@Override
	public Events getEventsByName(String eventName,String theatreCity) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		String queryString = "from Events e where e.eventName=:eventName";
		Query<Events> query = session.createQuery(queryString);
		query.setString("eventName", eventName);
		
		Events event = (Events) query.getSingleResult();
		if(event!= null)
		{
			List<Theaters> theaters = event.getTheaters();
			List<Theaters> locationTheaters = new ArrayList<Theaters>();
			for (Theaters theater : theaters) {
				String location = theater.getTheatreCity();
				if(location.equalsIgnoreCase(theatreCity))
				{
					locationTheaters.add(theater);
				}
			}
			if(locationTheaters.size()!=0)
			{
				event.setTheaters(locationTheaters);
			}
			else
				throw new javax.persistence.NoResultException("Event Name is Not In The current Location");
			return event;
		}
		else
		{
			throw new javax.persistence.NoResultException("Event Name is Not In The DB");
		}
		
	}
	

	@Override
	public List<Events> getEventsByLanguage(String eventLanguage,String theatreCity) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		String queryString = "from Events e where e.eventLanguage=:eventLanguage";
		Query<Events> query = session.createQuery(queryString);
		query.setString("eventLanguage", eventLanguage);
		
		List<Events>  events = (List<Events>) query.getResultList();
		List<Events> finalEvents = new ArrayList<Events>();
		if(list != null)
		{
			for (Events event : events) {
				List<Theaters> theaters = event.getTheaters();
				List<Theaters> locationTheaters = new ArrayList<Theaters>();
				for (Theaters theater : theaters) {
					String location = theater.getTheatreCity();
					if(location.equalsIgnoreCase(theatreCity))
					{
						locationTheaters.add(theater);
					}
				}
				if(locationTheaters.size()!=0)
				{
					event.setTheaters(locationTheaters);
					finalEvents.add(event);
				}
			}
			return finalEvents;
		}
		else
		{
			throw new javax.persistence.NoResultException("Event language is Not In The DB");
		}
	}


}
