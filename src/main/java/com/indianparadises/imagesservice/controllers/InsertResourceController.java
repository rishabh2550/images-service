package com.indianparadises.imagesservice.controllers;

import com.indianparadises.imagesservice.services.InsertResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class InsertResourceController {

    @Autowired
    private InsertResourceService insertResourceService;

    @GetMapping(path = "/insertANewcityImageFromFile")
    public void insertANewcityImageFromFile() throws IOException {
        insertResourceService.insertANewcityImageFromFile();
    }

}
