package com.cg.mts.dto;


import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

public class TheatersSavePostDTO {

	@NotNull(message = "Name must be mentioned")
	private String theaterName;
	@NotNull(message = "City must be mentioned")
	private String theaterCity;
	@NotNull(message = "Name must be mentioned")
	private String managerName;
	@NotNull(message = "Contact must be mentioned")
	private String managerContact;
	@Range(min=1,max=10)
	private String seats;
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public String getTheaterCity() {
		return theaterCity;
	}
	public void setTheaterCity(String theaterCity) {
		this.theaterCity = theaterCity;
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
	public String getSeats() {
		return seats;
	}
	public void setSeats(String seats) {
		this.seats = seats;
	}
	
	public TheatersSavePostDTO(@NotNull(message = "Name must be mentioned") String theaterName,
			@NotNull(message = "City must be mentioned") String theaterCity,
                        @NotNull(message = "Name must be mentioned") String managerName,
			@NotNull(message = "Contact must be mentioned") String managerContact,
                        @Range(min = 1, max = 10) String seats) {
		super();
		this.theaterName = theaterName;
		this.theaterCity = theaterCity;
		this.managerName = managerName;
		this.managerContact = managerContact;
		this.seats = seats;
	}

	
}
