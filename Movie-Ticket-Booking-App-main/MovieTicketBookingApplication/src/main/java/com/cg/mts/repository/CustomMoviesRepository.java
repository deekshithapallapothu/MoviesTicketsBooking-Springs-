package com.cg.mts.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.mts.entities.Movies;

@Repository
public interface CustomMoviesRepository {

	public List<Movies> getMoviesByLanguage(String movieLanguage,String theatreCity);
	public Movies getMoviesByName(String movieName,String theatreCity);
}
