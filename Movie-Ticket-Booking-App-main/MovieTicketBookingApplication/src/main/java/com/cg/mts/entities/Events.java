package com.cg.mts.entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;


@Entity
public class Events {
	@Id
	@SequenceGenerator(name="mylogic",initialValue=100,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.AUTO,generator="mylogic")
	private int eventId;
	@NotNull(message = "Name must be mentioned")
	private String eventName;
	@NotNull(message = "Genre must be mentioned")
	private String eventGenre;
	private int eventHours;
	@NotNull(message = "Language must be mentioned")
	private String eventLanguage;
	private LocalDate eventDate;
	private LocalTime eventTime;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(
			name="Events_Theater_Info",
			joinColumns=@JoinColumn(name="eventdetails"),
			inverseJoinColumns=@JoinColumn(name="theaterdetails"))
	private List<Theaters> theaters;
    
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(
			name="Customer_Event_Info",
			joinColumns=@JoinColumn(name="eventdetails"),
			inverseJoinColumns=@JoinColumn(name="customersdetails"))
	private List<Customers> customers;
	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

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

	public int getEventHours() {
		return eventHours;
	}

	public void setEventHours(int eventHours) {
		this.eventHours = eventHours;
	}

	public String getEventLanguage() {
		return eventLanguage;
	}

	public void setEventLanguage(String eventLanguage) {
		this.eventLanguage = eventLanguage;
	}

	public LocalDate getEventDate() {
		return eventDate;
	}

	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}

	public LocalTime getEventTime() {
		return eventTime;
	}

	public void setEventTime(LocalTime eventTime) {
		this.eventTime = eventTime;
	}

	public List<Theaters> getTheaters() {
		return theaters;
	}

	public void setTheaters(List<Theaters> theaters) {
		this.theaters = theaters;
	}

	

	public Events(int eventId, @NotNull(message = "Name must be mentioned") String eventName,
			@NotNull(message = "Genre must be mentioned") String eventGenre, int eventHours,
			@NotNull(message = "Language must be mentioned") String eventLanguage, LocalDate eventDate,
			LocalTime eventTime, List<Theaters> theaters, List<Customers> customers) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.eventGenre = eventGenre;
		this.eventHours = eventHours;
		this.eventLanguage = eventLanguage;
		this.eventDate = eventDate;
		this.eventTime = eventTime;
		this.theaters = theaters;
		this.customers = customers;
	}

	public Events() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return Objects.hash(customers, eventDate, eventGenre, eventHours, eventId, eventLanguage, eventName, eventTime,
				theaters);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Events other = (Events) obj;
		return Objects.equals(customers, other.customers) && Objects.equals(eventDate, other.eventDate)
				&& Objects.equals(eventGenre, other.eventGenre) && eventHours == other.eventHours
				&& eventId == other.eventId && Objects.equals(eventLanguage, other.eventLanguage)
				&& Objects.equals(eventName, other.eventName) && Objects.equals(eventTime, other.eventTime)
				&& Objects.equals(theaters, other.theaters);
	}

	@Override
	public String toString() {
		return "Events [eventId=" + eventId + ", eventName=" + eventName + ", eventGenre=" + eventGenre
				+ ", eventHours=" + eventHours + ", eventLanguage=" + eventLanguage + ", eventDate=" + eventDate
				+ ", eventTime=" + eventTime + ", theaters=" + theaters + ", customers=" + customers + "]";
	}

	
}
