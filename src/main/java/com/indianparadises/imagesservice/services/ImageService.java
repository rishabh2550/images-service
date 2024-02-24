package com.indianparadises.imagesservice.services;

import com.indianparadises.imagesservice.dtos.ImageDTO;
import com.indianparadises.imagesservice.repositories.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ImageService {

    @Autowired
    private ImageRepository imageRepository;

    public List<ImageDTO> fetchPrimaryCityImages() {
        return imageRepository.fetchPrimaryCityImages();
    }

}
