package com.indianparadises.imagesservice.services;

import com.indianparadises.imagesservice.entities.AboutSectionImage;
import com.indianparadises.imagesservice.entities.HomeCarouselImage;
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

    public List<HomeCarouselImage> fetchHomeCarouselImages() {
        return homeRepository.fetchHomeCarouselImages();
    }

    public AboutSectionImage fetchAboutSectionImage() {
        return homeRepository.fetchAboutSectionImage();
    }

}
