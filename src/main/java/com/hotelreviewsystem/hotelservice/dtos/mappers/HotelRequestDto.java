package com.hotelreviewsystem.hotelservice.dtos.mappers;


import com.hotelreviewsystem.hotelservice.dtos.HotelDto;
import com.hotelreviewsystem.hotelservice.entities.Hotel;

public class HotelRequestDto {

    public static Hotel convertHotelRequestDtotoHotel(HotelDto hotelDto) {
            Hotel hotel = new Hotel();
            hotel.setHotelName(hotelDto.getHotelName());
            hotel.setHotelAddress(hotelDto.getHotelAddress());
            hotel.setHotelCity(hotelDto.getHotelCity());
            hotel.setHotelState(hotelDto.getHotelState());
            hotel.setHotelCountry(hotelDto.getHotelCountry());
            hotel.setHotelPhone(hotelDto.getHotelPhone());
            hotel.setHotelEmail(hotelDto.getHotelEmail());
            hotel.setHotelWebsite(hotelDto.getHotelWebsite());
            hotel.setHotelDescription(hotelDto.getHotelDescription());
            return hotel;
    }
}
