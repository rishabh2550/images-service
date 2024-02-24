package com.indianparadises.imagesservice.repositories;

import com.indianparadises.imagesservice.entities.AboutSection;
import com.indianparadises.imagesservice.entities.CityImage;
import com.indianparadises.imagesservice.entities.HomeCarousel;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Repository
public class InsertImageRepository {

    @Autowired
    private EntityManager em;

    public void insertANewcityImageFromFile() throws IOException {
        String filePath = "C:\\Users\\risha\\Downloads\\manali.jpg";
        File file = new File(filePath);
        FileInputStream fis = new FileInputStream(file);
        byte[] ba = new byte[(int)file.length()];
        fis.read(ba);
        fis.close();
        CityImage ci = new CityImage(202L, "manali.jpg", ba, true);
        em.persist(ci);
    }

}
