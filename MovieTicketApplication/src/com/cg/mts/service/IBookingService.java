package com.cg.mts.service;

import java.time.LocalDate;
import java.util.List;

import com.cg.mts.entities.Booking;
import com.cg.mts.exception.BookingNotFoundException;

public interface IBookingService {
	public Booking addBooking(Booking booking);
	public Booking updateBooking(Booking booking) throws BookingNotFoundException;
	public Booking cancelBooking(int bookingid) throws BookingNotFoundException;
	public List<Booking> showAllBookings(int movieid);
	public List<Booking> showAllBookings(LocalDate bookingdate);
	public List<Booking> showBookingList(int showid);
	public double calculateTotalCost(int bookingid);
	
}
