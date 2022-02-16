package com.cg.mts.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.mts.entities.Customers;
import com.cg.mts.entities.Theaters;


@Service
public interface ITheatersService {

	public Theaters createTheater(Theaters theater);
	public List<Theaters> getAllTheaters();
	public boolean removeTheaterById(int theaterId);
	public Theaters getTheaterById(int theaterId);
}
