package com.indianparadises.imagesservice.services;

import com.indianparadises.imagesservice.entities.CityImage;
import com.indianparadises.imagesservice.repositories.DestinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DestinationService {

    @Autowired
    private DestinationRepository destinationRepository;

    public List<CityImage> fetchCityImages() {
        return destinationRepository.fetchCityImages();
    }

}
