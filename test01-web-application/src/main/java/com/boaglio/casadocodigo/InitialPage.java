package com.boaglio.casadocodigo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class InitialPage {
	
	
@RequestMapping("/")
 public String home() {
	return "Hello Spring Boot!";
	}

public static void main( String[] args){

	   SpringApplication.run(InitialPage.class , args);
	}

}