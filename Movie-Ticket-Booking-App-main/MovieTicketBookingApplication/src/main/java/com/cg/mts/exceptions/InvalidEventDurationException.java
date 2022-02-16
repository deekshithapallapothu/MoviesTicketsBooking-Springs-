package com.cg.mts.exceptions;

public class InvalidEventDurationException extends Exception {
  private int eventDuration;

public InvalidEventDurationException() {
	super();
	// TODO Auto-generated constructor stub
}
public InvalidEventDurationException(int eventDuration) {
	super();
	this.eventDuration=eventDuration;
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Event duration must be less than or equal to "+this.eventDuration+" hours.";
}


}
