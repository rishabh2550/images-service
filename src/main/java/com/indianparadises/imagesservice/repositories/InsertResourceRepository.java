package com.indianparadises.imagesservice.repositories;

import com.indianparadises.imagesservice.entities.*;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Repository
public class InsertResourceRepository {

    @Autowired
    private EntityManager em;

    public void insertANewcityImageFromFile() throws IOException {
        String filePath = "C:\\Users\\risha\\Downloads\\dadar_flower_market.jpg";
        File file = new File(filePath);
        FileInputStream fis = new FileInputStream(file);
        byte[] ba = new byte[(int)file.length()];
        fis.read(ba);
        fis.close();
        ShoppingSpotImage ai = new ShoppingSpotImage(106L, "dadar_flower_market.jpg", ba);
        em.persist(ai);
    }

}
