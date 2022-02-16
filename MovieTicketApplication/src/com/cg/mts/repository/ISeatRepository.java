package com.cg.mts.repository;

import com.cg.mts.entities.Seat;

public interface ISeatRepository {
public Seat bookSeat(Seat seat);
public Seat cancelSeatBooking(Seat seat);
public Seat blockSeat(Seat seat); //not available for any booking 
}
