package com.cg.mts.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.mts.dto.EventsInfoDTO;
import com.cg.mts.dto.EventsSavePostDTO;
import com.cg.mts.entities.Events;

@Service
public interface IEventsService {
	
	public boolean removeEvent(int eventId) ;
	public Events viewEvents(int eventId) ;
	public List<Events> viewAllEvents();
	public Events createEvents(Events events);
	public boolean checkEventsById(int eventId);
	
	public EventsInfoDTO saveEvents(EventsSavePostDTO eventsDto);
	public List<Events> getEventsByGenre(String eventGenre,String theatreCity);
	public List<Events> getEventsByLanguage(String eventLanguage,String theatreCity);
	public Events getEventsByName(String eventName,String theatreCity);
	public List<Events> sortEventsBasedOnHours();
	
}
