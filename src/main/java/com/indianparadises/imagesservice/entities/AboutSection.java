package com.indianparadises.imagesservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class AboutSection {

    public AboutSection(String imageName, byte[] image, String header, String description) {
        this.imageName = imageName;
        this.image = image;
        this.header = header;
        this.description = description;
    }

    @Id
    @GeneratedValue
    private Long id;

    private String imageName;

    @Lob
    private byte[] image;

    @Lob
    private String header;

    @Lob
    private String description;

}
