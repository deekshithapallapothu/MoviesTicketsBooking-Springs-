package com.cg.mts.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;


@Entity
public class Theaters {
	
	@Id
	@SequenceGenerator(name="mylogic2",initialValue=1000,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.AUTO,generator="mylogic2")
	private int theatreId;
	private String theatreName;
	private String theatreCity;
	private String managerName;
	private String managerContact;
	private int seats;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(
			name="Events_Theater_Info",
			joinColumns=@JoinColumn(name="theaterdetails"),
			inverseJoinColumns=@JoinColumn(name="eventdetails"))
	private List<Events> events;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(
			name="Movies_Theater_Info",
			joinColumns=@JoinColumn(name="theaterdetails"),
			inverseJoinColumns=@JoinColumn(name="moviedetails"))
	private List<Movies> movies;
	
	public int getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public String getTheatreCity() {
		return theatreCity;
	}
	public void setTheatreCity(String theatreCity) {
		this.theatreCity = theatreCity;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getManagerContact() {
		return managerContact;
	}
	public void setManagerContact(String managerContact) {
		this.managerContact = managerContact;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}

	public Theaters(int theatreId, String theatreName, String theatreCity, String managerName, String managerContact,
			int seats) {
		super();
		this.theatreId = theatreId;
		this.theatreName = theatreName;
		this.theatreCity = theatreCity;
		this.managerName = managerName;
		this.managerContact = managerContact;
		this.seats = seats;
	}
	public Theaters() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}