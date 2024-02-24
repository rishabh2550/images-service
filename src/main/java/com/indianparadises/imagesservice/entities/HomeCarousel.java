package com.indianparadises.imagesservice.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.core.io.ByteArrayResource;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class HomeCarousel {

    public HomeCarousel(String imageName, byte[] image, String header, String description) {
        this.imageName = imageName;
        this.image = image;
        this.header = header;
        this.description = description;
    }

    @Id
    @GeneratedValue
    private Long imageId;

    private String imageName;

    @Lob
    private byte[] image;

    private String header;

    private String description;

}
