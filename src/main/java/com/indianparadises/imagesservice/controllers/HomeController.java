package com.indianparadises.imagesservice.controllers;

import com.indianparadises.imagesservice.entities.AboutSectionImage;
import com.indianparadises.imagesservice.entities.HomeCarouselImage;
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

    @GetMapping(path = "/fetchHomeCarouselImages")
    public ResponseEntity<List<HomeCarouselImage>> fetchHomeCarouselImages() {
        List<HomeCarouselImage> homeCarouselImages = homeService.fetchHomeCarouselImages();
        return new ResponseEntity<>(homeCarouselImages, HttpStatus.OK);
    }

    @GetMapping(path="/fetchAboutSectionImage")
    public ResponseEntity<AboutSectionImage> fetchAboutSectionImage() {
        AboutSectionImage aboutSection = homeService.fetchAboutSectionImage();
        return new ResponseEntity<>(aboutSection, HttpStatus.OK);
    }

}
