package com.cg.mts.service;

import com.cg.mts.entities.Seat;

public interface ISeatService {
public Seat bookSeat(Seat seat);
public Seat cancelSeatBooking(Seat seat);
public Seat blockSeat(Seat seat); //not available for any booking 
}
