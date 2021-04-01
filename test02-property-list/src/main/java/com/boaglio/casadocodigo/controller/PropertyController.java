package com.boaglio.casadocodigo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boaglio.casadocodigo.Property;
import com.boaglio.casadocodigo.PropertyRepository;

@RestController
@RequestMapping("/api")
public class PropertyController {
	
	@Autowired
	private PropertyRepository repository;
	
	@RequestMapping(value="/find/{filter}", method=RequestMethod.GET)
	List<Property> findByFilter
	(@PathVariable("filter") String filter){
		return repository.findByFilter(filter);
	}
}
