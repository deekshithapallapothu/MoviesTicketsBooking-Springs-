package com.cg.mts.util;

import java.util.Random;

import org.springframework.stereotype.Component;

import com.cg.mts.dto.EventsInfoDTO;
import com.cg.mts.dto.EventsSavePostDTO;
import com.cg.mts.entities.Events;
@Component
public class EventsDTOConvertionClass {

	public EventsInfoDTO getEventsInfoDTO(Events events) {
		
		EventsInfoDTO dtoObj=new EventsInfoDTO();
		dtoObj.setEventId(events.getEventId());
		dtoObj.setEventName(events.getEventName());
		dtoObj.setEventGenre(events.getEventGenre());
		dtoObj.setEventHours(events.getEventHours());
		dtoObj.setEventLanguage(events.getEventLanguage());
		dtoObj.setCommunicationId((new Random().nextInt(5000)));
		return dtoObj;
		
	}
	public Events getEventsFromPostEventsDTO(EventsSavePostDTO dto) {
		
		Events e=new Events();
		e.setEventName(dto.getEventName());
		e.setEventGenre(dto.getEventGenre());
		e.setEventLanguage(dto.getEventLanguage());
		return e;
		
	}
	
}
