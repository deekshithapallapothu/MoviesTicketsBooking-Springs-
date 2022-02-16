package com.cg.mts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.mts.entities.Theaters;
import com.cg.mts.repository.ITheatersRepository;


@Service
public class TheatersServiceImpl implements ITheatersService {

	
	@Autowired
	ITheatersRepository repository;
	@Override
	public Theaters createTheater(Theaters theater) {
		// TODO Auto-generated method stub
		return repository.save(theater);
	}

	@Override
	public List<Theaters> getAllTheaters() {
		// TODO Auto-generated method stub
		List<Theaters> list=(List<Theaters>) repository.findAll();
		return list;
	}

	@Override
	public boolean removeTheaterById(int theaterId) {
		// TODO Auto-generated method stub
		repository.deleteById(theaterId);
		return true;
	}

	@Override
	public Theaters getTheaterById(int theaterId) {
		// TODO Auto-generated method stub
		return repository.findById(theaterId).get() ;
	}
 
	
}
