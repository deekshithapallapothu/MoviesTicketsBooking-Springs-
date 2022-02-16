package com.cg.mts.exceptions;

public class InvalidMovieDurationException extends Exception{
	
	private int movieDuration;

	public InvalidMovieDurationException() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InvalidMovieDurationException(int movieDuration) {
		super();
		this.movieDuration=movieDuration;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Movie duration must be less than or equal to "+this.movieDuration+" hours.";
	}


}
