package com.indianparadises.imagesservice.services;

import com.indianparadises.imagesservice.repositories.InsertImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

@Service
@Transactional
public class InsertImageService {

    @Autowired
    private InsertImageRepository insertImageRepository;

    public void insertANewcityImageFromFile() throws IOException {
        insertImageRepository.insertANewcityImageFromFile();
    }

}
