package com.indianparadises.imagesservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "accomodation_images")
@Getter
@Setter
@NoArgsConstructor
public class AccomodationImage {

    public AccomodationImage(Long accomodationId, String imageName, byte[] image) {
        this.accomodationId = accomodationId;
        this.imageName = imageName;
        this.image = image;
    }

    @Id
    @GeneratedValue
    private Long imageId;

    @Column(nullable = false)
    private Long accomodationId;

    @Column(nullable = false)
    private String imageName;

    @Lob
    @Column(nullable = false)
    private byte[] image;

}
