package com.abraham.catalogservice.resource;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abraham.catalogservice.model.CatalogItem;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

	// produces = MediaType.APPLICATION_JSON_VALUE
	@GetMapping(path= "/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable String userId){
		
		return Collections.singletonList(
				new CatalogItem("Transformers","Test",5));
		
	}
	
}
