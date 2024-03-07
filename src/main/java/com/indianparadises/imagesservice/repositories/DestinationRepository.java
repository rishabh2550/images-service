package com.indianparadises.imagesservice.repositories;

import com.indianparadises.imagesservice.entities.CityImage;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DestinationRepository {

    @Autowired
    private EntityManager em;

    public List<CityImage> fetchCityImages() {
        String jpql = "select c from CityImage c";
        TypedQuery<CityImage> query = em.createQuery(jpql, CityImage.class);
        return query.getResultList();
    }

}
