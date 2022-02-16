package com.cg.mts.entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Booking {
	@Id
	@SequenceGenerator(name="mylogic4",initialValue=400,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.AUTO,generator="mylogic4")
	private int bookingId;
	private LocalDate dateOfBooking;
	private LocalTime timeslot;
	
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public LocalDate getDateOfBooking() {
		return dateOfBooking;
	}
	public void setDateOfBooking(LocalDate dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
	}
	public LocalTime getTimeslot() {
		return timeslot;
	}
	public void setTimeslot(LocalTime timeslot) {
		this.timeslot = timeslot;
	}
	public Booking(int bookingId, LocalDate dateOfBooking, LocalTime timeslot) {
		super();
		this.bookingId = bookingId;
		this.dateOfBooking = dateOfBooking;
		this.timeslot = timeslot;
	}
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(bookingId, dateOfBooking, timeslot);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Booking other = (Booking) obj;
		return bookingId == other.bookingId && Objects.equals(dateOfBooking, other.dateOfBooking)
				&& Objects.equals(timeslot, other.timeslot);
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", dateOfBooking=" + dateOfBooking + ", timeslot=" + timeslot + "]";
	}

	
}
