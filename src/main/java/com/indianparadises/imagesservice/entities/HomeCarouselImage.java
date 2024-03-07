package com.indianparadises.imagesservice.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "home_carousel_images")
@NoArgsConstructor
@Getter
@Setter
public class HomeCarouselImage {

    public HomeCarouselImage(String imageName, byte[] image) {
        this.imageName = imageName;
        this.image = image;
    }

    @Id
    @GeneratedValue
    private Long imageId;

    @Column(nullable = false)
    private String imageName;

    @Lob
    private byte[] image;

}
