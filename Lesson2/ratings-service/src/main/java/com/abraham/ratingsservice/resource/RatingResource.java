package com.abraham.ratingsservice.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abraham.ratingsservice.model.Rating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {

	@GetMapping(path = "/{movieId}")
	public Rating getRating(@PathVariable String movieId) {
		return new Rating(movieId, 4);
	}
	
}
