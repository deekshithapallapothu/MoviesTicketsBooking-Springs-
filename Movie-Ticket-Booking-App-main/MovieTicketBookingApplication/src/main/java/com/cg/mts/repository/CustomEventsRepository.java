package com.cg.mts.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.mts.entities.Events;
@Repository
public interface CustomEventsRepository {

	public List<Events> getEventsByGenre(String eventGenre,String theatreCity);
	public List<Events> getEventsByLanguage(String eventLanguage,String theatreCity);
	public Events getEventsByName(String eventName,String theatreCity);
	
	
}
