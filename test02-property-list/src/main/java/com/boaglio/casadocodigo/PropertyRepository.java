package com.boaglio.casadocodigo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface PropertyRepository 
	extends PagingAndSortingRepository<Property, String>{
		
	
		@Query("SELECT c from Property c WHERE c.nome LIKE %:filter% ORDER BY category, subcategory, name")
		public List<Property> findByFilter(@Param("filter") String filter);
	
	}

