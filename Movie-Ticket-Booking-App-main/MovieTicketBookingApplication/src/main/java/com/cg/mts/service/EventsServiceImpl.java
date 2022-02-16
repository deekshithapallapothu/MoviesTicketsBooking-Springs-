package com.cg.mts.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.mts.dto.EventsInfoDTO;
import com.cg.mts.dto.EventsSavePostDTO;
import com.cg.mts.entities.Events;
import com.cg.mts.repository.IEventsRepository;
import com.cg.mts.sorting.ByEventsHours;
import com.cg.mts.util.EventsDTOConvertionClass;
@Service
public class EventsServiceImpl implements IEventsService{
	@Autowired
	IEventsRepository repository;

	@Autowired
	EventsDTOConvertionClass dtoConvertion;
	
	@Autowired
	ByEventsHours sortByEventHoursHigherToLower;
	
	@Override
	public boolean removeEvent(int eventId) {
		// TODO Auto-generated method stub
		repository.deleteById(eventId);
		return true;
	}

	@Override
	public Events viewEvents(int eventId) {
		// TODO Auto-generated method stub
		return repository.findById(eventId).get();
	}

	@Override
	public List<Events> viewAllEvents() {
		// TODO Auto-generated method stub
		List<Events> list=(List<Events>) repository.findAll();
		return list;
	}

	@Override
	public List<Events> getEventsByGenre(String eventGenre,String theatreCity) {
		// TODO Auto-generated method stub
		return repository.getEventsByGenre(eventGenre,theatreCity);
	}

	@Override
	public List<Events> getEventsByLanguage(String eventLanguage,String theatreCity) {
		// TODO Auto-generated method stub
		return repository.getEventsByLanguage(eventLanguage,theatreCity);
	}



	@Override
	public Events createEvents(Events events) {
		// TODO Auto-generated method stub
		return repository.save(events);
	}

	@Override
	public boolean checkEventsById(int eventId) {
		// TODO Auto-generated method stub
		return repository.existsById(eventId);
	}

	@Override
	public Events getEventsByName(String eventName,String theatreCity) {
		// TODO Auto-generated method stub
		return repository.getEventsByName(eventName,theatreCity);
	}

	@Override
	public EventsInfoDTO saveEvents(EventsSavePostDTO eventsDto) {
		// TODO Auto-generated method stub
		Events c=dtoConvertion.getEventsFromPostEventsDTO(eventsDto);
		Events savedObj=repository.save(c);
		EventsInfoDTO dtoObj=dtoConvertion.getEventsInfoDTO(savedObj);
		return dtoObj;
	}

	@Override
	public List<Events> sortEventsBasedOnHours() {
		// TODO Auto-generated method stub
	
		List<Events> list=viewAllEvents();
		Collections.sort(list, sortByEventHoursHigherToLower);
		return list ;
	}




}
