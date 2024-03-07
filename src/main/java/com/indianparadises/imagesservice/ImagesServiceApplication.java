package com.indianparadises.imagesservice;

import com.indianparadises.imagesservice.services.InsertResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImagesServiceApplication {

	@Autowired
	private InsertResourceService insertImageService;

	public static void main(String[] args) {
		SpringApplication.run(ImagesServiceApplication.class, args);
	}

}
