package com.cg.mts.dto;

import javax.validation.constraints.NotNull;


public class EventsSavePostDTO {

	@NotNull(message = "Name must be mentioned")
	private String eventName;
	@NotNull(message = "Genre must be mentioned")
	private String eventGenre;
	@NotNull(message = "Language must be mentioned")
	private String eventLanguage;
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventGenre() {
		return eventGenre;
	}
	public void setEventGenre(String eventGenre) {
		this.eventGenre = eventGenre;
	}
	public String getEventLanguage() {
		return eventLanguage;
	}
	public void setEventLanguage(String eventLanguage) {
		this.eventLanguage = eventLanguage;
	}

	public EventsSavePostDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EventsSavePostDTO(@NotNull(message = "Name must be mentioned") String eventName,
			@NotNull(message = "Genre must be mentioned") String eventGenre,
			@NotNull(message = "Language must be mentioned") String eventLanguage) {
		super();
		this.eventName = eventName;
		this.eventGenre = eventGenre;
		this.eventLanguage = eventLanguage;
	}
	@Override
	public String toString() {
		return "EventsSavePostDTO [eventName=" + eventName + ", eventGenre=" + eventGenre + ", eventLanguage="
				+ eventLanguage + "]";
	}

	
}
