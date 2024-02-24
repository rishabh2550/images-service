package com.indianparadises.imagesservice.controllers;

import com.indianparadises.imagesservice.dtos.ImageDTO;
import com.indianparadises.imagesservice.services.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ImageController {

    @Autowired
    private ImageService imageService;

    @GetMapping(path = "fetchPrimaryCityImages")
    public ResponseEntity<List<ImageDTO>> fetchPrimaryCityImages() {
        List<ImageDTO> imageDTOs = imageService.fetchPrimaryCityImages();
        return new ResponseEntity<>(imageDTOs, HttpStatus.OK);
    }

}
