package com.abraham.ratingsinfo.model;

import java.io.Serializable;

public class Movie implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private String movieId;
	private String name;
	
	
	public Movie(String movieId,String name) {
		super();
		this.movieId = movieId;
		this.name = name;
	}


	public String getMovieId() {
		return movieId;
	}


	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
}
