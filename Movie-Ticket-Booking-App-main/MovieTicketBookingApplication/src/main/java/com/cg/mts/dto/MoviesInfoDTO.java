package com.cg.mts.dto;


public class MoviesInfoDTO {

	private int movieId;
	private String movieName;
	private String movieGenre;
	private String movieHours;
	private String movieLanguage;
	private int mcommunicationId;
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
	public String getMovieHours() {
		return movieHours;
	}
	public void setMovieHours(String movieHours) {
		this.movieHours = movieHours;
	}
	public String getMovieLanguage() {
		return movieLanguage;
	}
	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}

	public int getmCommunicationId() {
		return mcommunicationId;
	}
	public void setmCommunicationId(int mcommunicationId) {
		this.mcommunicationId = mcommunicationId;
	}
	
	public MoviesInfoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MoviesInfoDTO(int movieId, String movieName, String movieGenre, String movieHours, String movieLanguage,
			int mcommunicationId) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieGenre = movieGenre;
		this.movieHours = movieHours;
		this.movieLanguage = movieLanguage;
		this.mcommunicationId = mcommunicationId;
	}
	@Override
	public String toString() {
		return "MoviesInfoDTO [movieId=" + movieId + ", movieName=" + movieName + ", movieGenre=" + movieGenre
				+ ", movieHours=" + movieHours + ", movieLanguage=" + movieLanguage + ", mcommunicationId="
				+ mcommunicationId + "]";
	}
	
	
}
