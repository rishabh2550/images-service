package com.indianparadises.imagesservice.repositories;

import com.indianparadises.imagesservice.entities.AboutSection;
import com.indianparadises.imagesservice.entities.HomeCarousel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HomeRepository {

    @Autowired
    private EntityManager em;

    public HomeCarousel fetchHomeCarouselImage(Long imageId) {
        return em.find(HomeCarousel.class, imageId);
    }

    public List<HomeCarousel> fetchAllHomeCarouselImages() {
        String jpql = "select h from HomeCarousel h";
        TypedQuery<HomeCarousel> query = em.createQuery(jpql, HomeCarousel.class);
        return query.getResultList();
    }

    public AboutSection fetchAboutSectionDetails() {
        String jpql = "select a from AboutSection a order by random() limit 1";
        TypedQuery<AboutSection> query = em.createQuery(jpql, AboutSection.class);
        AboutSection aboutSection = query.getResultList().stream().findFirst().orElse(null);
        return aboutSection;
    }

}
