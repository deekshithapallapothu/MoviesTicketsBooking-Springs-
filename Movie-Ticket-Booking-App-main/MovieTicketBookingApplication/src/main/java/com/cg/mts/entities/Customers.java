package com.cg.mts.entities;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Customers {
	@Id
	@SequenceGenerator(name="mylogic3",initialValue=300,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.AUTO,generator="mylogic3")
	private String customerId;
	private String password;
    private String customerName;
	private String mobileNumber;
	private int age;
	private int noOfTickets;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(
			name="Customer_Event_Info",
			joinColumns=@JoinColumn(name="customerdetails"),
			inverseJoinColumns=@JoinColumn(name="eventdetails"))
	private List<Events> events;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(
			name="Customer_Movie_Info",
			joinColumns=@JoinColumn(name="customerdetails"),
			inverseJoinColumns=@JoinColumn(name="moviedetails"))
	private List<Movies> movies;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(
			name="Customer_Booking_Info",
			joinColumns=@JoinColumn(name="customerdetails"),
			inverseJoinColumns=@JoinColumn(name="bookingdetails"))
	private List<Booking> booking;
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	public List<Events> getEvents() {
		return events;
	}
	public void setEvents(List<Events> events) {
		this.events = events;
	}
	public List<Booking> getBooking() {
		return booking;
	}
	public void setBooking(List<Booking> booking) {
		this.booking = booking;
	}
	public List<Movies> getMovies() {
		return movies;
	}
	public void setMovies(List<Movies> movies) {
		this.movies = movies;
	}
	public Customers(String customerId, String password, String customerName, String mobileNumber, int noOfTickets,
			List<Events> events, List<Movies> movies, List<Booking> booking,int age) {
		super();
		this.customerId = customerId;
		this.password = password;
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.noOfTickets = noOfTickets;
		this.events = events;
		this.movies = movies;
		this.booking = booking;
		this.age=age;
	}
	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(booking, customerId, customerName, events, mobileNumber, movies, noOfTickets, password);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customers other = (Customers) obj;
		return Objects.equals(booking, other.booking) && Objects.equals(customerId, other.customerId)
				&& Objects.equals(customerName, other.customerName) && Objects.equals(events, other.events)
				&& Objects.equals(mobileNumber, other.mobileNumber) && Objects.equals(movies, other.movies)
				&& noOfTickets == other.noOfTickets && Objects.equals(password, other.password);
	}
	@Override
	public String toString() {
		return "Customers [customerId=" + customerId + ", password=" + password + ", customerName=" + customerName
				+ ", mobileNumber=" + mobileNumber + ", noOfTickets=" + noOfTickets + ", events=" + events + ", movies="
				+ movies + ", booking=" + booking + "]";
	}

    
	
}
