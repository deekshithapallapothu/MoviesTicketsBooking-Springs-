package com.cg.mts.dto;


import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

public class MoviesSavePostDTO {

	@NotNull(message = "Name must be mentioned")
	private String movieName;
	@NotNull(message = "Genre must be mentioned")
	private String movieGenre;
	@NotNull(message = "Language must be mentioned")
	private String movieLanguage;
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieGenre() {
		return movieGenre;
	}
	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}
	public String getMovieLanguage() {
		return movieLanguage;
	}
	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}
	@Override
	public int hashCode() {
		return Objects.hash(movieGenre, movieLanguage, movieName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MoviesSavePostDTO other = (MoviesSavePostDTO) obj;
		return Objects.equals(movieGenre, other.movieGenre) && Objects.equals(movieLanguage, other.movieLanguage)
				&& Objects.equals(movieName, other.movieName);
	}
	public MoviesSavePostDTO(@NotNull(message = "Name must be mentioned") String movieName,
			@NotNull(message = "Genre must be mentioned") String movieGenre,
			@NotNull(message = "Language must be mentioned") String movieLanguage) {
		super();
		this.movieName = movieName;
		this.movieGenre = movieGenre;
		this.movieLanguage = movieLanguage;
	}
	


	
}
