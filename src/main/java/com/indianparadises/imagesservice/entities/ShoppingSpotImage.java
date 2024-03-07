package com.indianparadises.imagesservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "shopping_spot_images")
@Getter
@Setter
@NoArgsConstructor
public class ShoppingSpotImage {

    public ShoppingSpotImage(Long shoppingSpotId, String imageName, byte[] image) {
        this.shoppingSpotId = shoppingSpotId;
        this.imageName = imageName;
        this.image = image;
    }

    @Id
    @GeneratedValue
    private Long imageId;

    @Column(nullable = false)
    private Long shoppingSpotId;

    @Column(nullable = false)
    private String imageName;

    @Lob
    @Column(nullable = false)
    private byte[] image;

}
