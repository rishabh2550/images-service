package com.indianparadises.imagesservice;

import com.indianparadises.imagesservice.services.InsertImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImagesServiceApplication implements CommandLineRunner {

	@Autowired
	private InsertImageService insertImageService;

	public static void main(String[] args) {
		SpringApplication.run(ImagesServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//insertImageService.insertANewcityImageFromFile();
	}
}
