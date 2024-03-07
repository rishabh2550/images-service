package com.indianparadises.imagesservice.mappers;

import com.indianparadises.imagesservice.dtos.ImageDTO;
import com.indianparadises.imagesservice.entities.CityImage;
import org.springframework.core.io.ByteArrayResource;

public class ImageDTOMapper {

    public static ImageDTO mapCityImageToImageDTO(CityImage cityImage) {
        ImageDTO imageDTO = new ImageDTO(cityImage.getImageId(), cityImage.getCityId(), cityImage.getImageName(), cityImage.getImage(), cityImage.isPrimaryImage());
        return imageDTO;
    }

}
