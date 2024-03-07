package com.indianparadises.imagesservice.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "about_section_images")
@NoArgsConstructor
@Getter
@Setter
public class AboutSectionImage {

    public AboutSectionImage(String imageName, byte[] image) {
        this.imageName = imageName;
        this.image = image;
    }

    @Id
    @GeneratedValue
    private Long id;

    private String imageName;

    @Lob
    private byte[] image;

}
