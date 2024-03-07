package com.indianparadises.imagesservice.services;

import com.indianparadises.imagesservice.repositories.InsertResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

@Service
@Transactional
public class InsertResourceService {

    @Autowired
    private InsertResourceRepository insertResourceRepository;

    public void insertANewcityImageFromFile() throws IOException {
        insertResourceRepository.insertANewcityImageFromFile();
    }

}
