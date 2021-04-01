package com.boaglio.casadocodigo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Property {

@Id
private String name;
private String value;
private String description;
private String category;
private String subcategory;


	
}
