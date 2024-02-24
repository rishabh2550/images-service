package com.indianparadises.imagesservice.repositories;

import com.indianparadises.imagesservice.dtos.ImageDTO;
import com.indianparadises.imagesservice.entities.CityImage;
import com.indianparadises.imagesservice.mappers.ImageDTOMapper;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ImageRepository {

    @Autowired
    private EntityManager em;

    public List<ImageDTO> fetchPrimaryCityImages() {
        String jpql = "select ci from CityImage ci where ci.primaryImage=true";
        TypedQuery<CityImage> query = em.createQuery(jpql, CityImage.class);
        List<CityImage> cityImages = query.getResultList();
        return cityImages.stream().map(ImageDTOMapper::mapCityImageToImageDTO).collect(Collectors.toList());
    }

}
