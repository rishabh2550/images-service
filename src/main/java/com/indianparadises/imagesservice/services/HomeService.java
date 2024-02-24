package com.indianparadises.imagesservice.services;

import com.indianparadises.imagesservice.entities.AboutSection;
import com.indianparadises.imagesservice.entities.HomeCarousel;
import com.indianparadises.imagesservice.repositories.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class HomeService {

    @Autowired
    private HomeRepository homeRepository;

    public List<HomeCarousel> fetchAllHomeCarouselImages() {
        return homeRepository.fetchAllHomeCarouselImages();
    }

    public AboutSection fetchAboutSectionDetails() {
        return homeRepository.fetchAboutSectionDetails();
    }

}
