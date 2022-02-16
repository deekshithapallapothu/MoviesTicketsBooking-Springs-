package com.cg.mts.repository;

import java.time.LocalDate;
import java.util.List;

import com.cg.mts.entities.Movie;
import com.cg.mts.exception.MovieNotFoundException;

public interface IMovieRepository {
	public Movie addMovie(Movie movie);
	public Movie removeMovie(int movieid) throws MovieNotFoundException;
	public Movie updateMovie(Movie movie) throws MovieNotFoundException;
	public Movie viewMovie(int movieid) throws MovieNotFoundException;
	public List<Movie> viewMovieList();
	public List<Movie> viewMovieList(int theatreid);
	public List<Movie> viewMovieList(LocalDate date);
	
}
