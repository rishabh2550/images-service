package com.indianparadises.imagesservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "restaurant_images")
@Getter
@Setter
@NoArgsConstructor
public class RestaurantImage {

    public RestaurantImage(Long restaurantId, String imageName, byte[] image) {
        this.restaurantId = restaurantId;
        this.imageName = imageName;
        this.image = image;
    }

    @Id
    @GeneratedValue
    private Long imageId;

    @Column(nullable = false)
    private Long restaurantId;

    @Column(nullable = false)
    private String imageName;

    @Lob
    @Column(nullable = false)
    private byte[] image;

}
