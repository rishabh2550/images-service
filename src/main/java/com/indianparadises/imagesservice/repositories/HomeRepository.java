package com.indianparadises.imagesservice.repositories;

import com.indianparadises.imagesservice.entities.AboutSectionImage;
import com.indianparadises.imagesservice.entities.HomeCarouselImage;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HomeRepository {

    @Autowired
    private EntityManager em;

    public List<HomeCarouselImage> fetchHomeCarouselImages() {
        String jpql = "select h from HomeCarouselImage h";
        TypedQuery<HomeCarouselImage> query = em.createQuery(jpql, HomeCarouselImage.class);
        return query.getResultList();
    }

    public AboutSectionImage fetchAboutSectionImage() {
        String jpql = "select a from AboutSectionImage a";
        TypedQuery<AboutSectionImage> query = em.createQuery(jpql, AboutSectionImage.class);
        AboutSectionImage aboutSection = query.getResultList().stream().findFirst().orElse(null);
        return aboutSection;
    }

}
