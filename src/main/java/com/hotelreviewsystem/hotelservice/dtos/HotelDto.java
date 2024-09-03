package com.hotelreviewsystem.hotelservice.dtos;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class HotelDto {
    private String hotelName;
    private String hotelAddress;
    private String hotelCity;
    private String hotelState;
    private String hotelCountry;
    private String hotelPhone;
    private String hotelEmail;
    private String hotelWebsite;
    private String hotelDescription;
}
