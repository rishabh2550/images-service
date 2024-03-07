package com.indianparadises.imagesservice.controllers;

import com.indianparadises.imagesservice.entities.CityImage;
import com.indianparadises.imagesservice.services.DestinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DestinationController {

    @Autowired
    private DestinationService destinationService;

    @GetMapping(path = "/fetchCityImages")
    public ResponseEntity<List<CityImage>> fetchCityImages() {
        List<CityImage> cityImages = destinationService.fetchCityImages();
        return new ResponseEntity<>(cityImages, HttpStatus.OK);
    }

}
