package com.indianparadises.imagesservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "attraction_images")
@Getter
@Setter
@NoArgsConstructor
public class AttractionImage {

    public AttractionImage(Long attractionId, String imageName, byte[] image) {
        this.attractionId = attractionId;
        this.imageName = imageName;
        this.image = image;
    }

    @Id
    @GeneratedValue
    private Long imageId;

    @Column(nullable = false)
    private Long attractionId;

    @Column(nullable = false)
    private String imageName;

    @Lob
    @Column(nullable = false)
    private byte[] image;

}
