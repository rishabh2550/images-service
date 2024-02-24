package com.indianparadises.imagesservice.controllers;

import com.indianparadises.imagesservice.entities.AboutSection;
import com.indianparadises.imagesservice.entities.HomeCarousel;
import com.indianparadises.imagesservice.services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping(path="/fetchAllHomeCarouselImages")
    public ResponseEntity<List<HomeCarousel>> fetchAllHomeCarouselImages() {
        List<HomeCarousel> homeCarousel = homeService.fetchAllHomeCarouselImages();
        return new ResponseEntity<>(homeCarousel, HttpStatus.OK);
    }

    @GetMapping(path="/fetchAboutSectionDetails")
    public ResponseEntity<AboutSection> fetchAboutSectionDetails() {
        AboutSection aboutSection = homeService.fetchAboutSectionDetails();
        return new ResponseEntity<>(aboutSection, HttpStatus.OK);
    }

}
