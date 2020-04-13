package com.abraham.ratingsinfo.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abraham.ratingsinfo.model.Movie;

@RestController
@RequestMapping("/movies")
public class MovieInfoResource {

	@GetMapping(path = "/{movieId}")
	public Movie getMovieInfo(@PathVariable String movieId) {
		return new Movie(movieId, "Transformer" );
	}
	
	
}
