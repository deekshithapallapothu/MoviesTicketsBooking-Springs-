package com.cg.mts.entities;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

@Entity
public class Movies {

	@Id
	@SequenceGenerator(name="mylogic1",initialValue=200,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.AUTO,generator="mylogic1")
	private int movieId;
	@NotNull(message = "Name must be mentioned")
	private String movieName;
	@NotNull(message = "Genre must be mentioned")
	private String movieGenre;
	private int movieHours;
	@NotNull(message = "Language must be mentioned")
	private String movieLanguage;
	private String movieDescription;
	private String censorRating;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(
			name="Movies_Theater_Info",
			joinColumns=@JoinColumn(name="moviedetails"),
			inverseJoinColumns=@JoinColumn(name="theaterdetails"))
	private List<Theaters> theaters;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(
			name="Customer_Movie_Info",
			joinColumns=@JoinColumn(name="moviedetails"),
			inverseJoinColumns=@JoinColumn(name="customerdetails"))
	private List<Customers> customers;
	
	public Movies() {
		super();
		// TODO Auto-generated constructor stub
	}

	


	@Override
	public int hashCode() {
		return Objects.hash(censorRating, customers, movieDescription, movieGenre, movieHours, movieId, movieLanguage,
				movieName, theaters);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movies other = (Movies) obj;
		return Objects.equals(censorRating, other.censorRating) && Objects.equals(customers, other.customers)
				&& Objects.equals(movieDescription, other.movieDescription)
				&& Objects.equals(movieGenre, other.movieGenre) && movieHours == other.movieHours
				&& movieId == other.movieId && Objects.equals(movieLanguage, other.movieLanguage)
				&& Objects.equals(movieName, other.movieName) && Objects.equals(theaters, other.theaters);
	}




	public Movies(int movieId, @NotNull(message = "Name must be mentioned") String movieName,
			@NotNull(message = "Genre must be mentioned") String movieGenre, int movieHours,
			@NotNull(message = "Language must be mentioned") String movieLanguage, String movieDescription,
			String censorRating, List<Theaters> theaters, List<Customers> customers) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieGenre = movieGenre;
		this.movieHours = movieHours;
		this.movieLanguage = movieLanguage;
		this.movieDescription = movieDescription;
		this.censorRating = censorRating;
		this.theaters = theaters;
		this.customers = customers;
	}




	public String getCensorRating() {
		return censorRating;
	}

	public void setCensorRating(String censorRating) {
		this.censorRating = censorRating;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

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

	public int getMovieHours() {
		return movieHours;
	}

	public void setMovieHours(int movieHours) {
		this.movieHours = movieHours;
	}

	public String getMovieLanguage() {
		return movieLanguage;
	}

	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}

	public String getMovieDescription() {
		return movieDescription;
	}

	public void setMovieDescription(String movieDescription) {
		this.movieDescription = movieDescription;
	}

	public List<Theaters> getTheaters() {
		return theaters;
	}

	public void setTheaters(List<Theaters> theaters) {
		this.theaters = theaters;
	}




	@Override
	public String toString() {
		return "Movies [movieId=" + movieId + ", movieName=" + movieName + ", movieGenre=" + movieGenre
				+ ", movieHours=" + movieHours + ", movieLanguage=" + movieLanguage + ", movieDescription="
				+ movieDescription + ", censorRating=" + censorRating + ", theaters=" + theaters + ", customers="
				+ customers + "]";
	}


	
	
}