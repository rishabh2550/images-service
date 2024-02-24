package com.indianparadises.imagesservice.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "city_images")
@NoArgsConstructor
@Getter
@Setter
public class CityImage {

    public CityImage(Long cityId, String imageName, byte[] image, boolean primaryImage) {
        this.cityId = cityId;
        this.imageName = imageName;
        this.image = image;
        this.primaryImage = primaryImage;
    }

    @Id
    @GeneratedValue
    private Long imageId;

    @Column(nullable = false)
    private Long cityId;

    @Column(nullable = false)
    private String imageName;

    @Lob
    @Column(nullable = false)
    private byte[] image;

    @Column
    private boolean primaryImage;

    @Column
    private String header;

    @Column
    private String description;

}
