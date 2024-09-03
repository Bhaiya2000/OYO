package com.hotelreviewsystem.hotelservice.services;


import com.hotelreviewsystem.hotelservice.entities.Hotel;

import java.util.List;
import java.util.Optional;

public interface HotelService {

    Hotel saveHotel(Hotel hotel);     // done

    Optional<Hotel> findHotelById(String id);   // done

    Optional<List<Hotel>> findByHotelName(String hotelName); // done

    Optional<List<Hotel>> findByHotelAddress(String address); // done

    Optional<List<Hotel>> findByHotelCity(String city); // done

    Optional<List<Hotel>> findByHotelState(String state); // done

    Optional<List<Hotel>> findByHotelCountry(String country); // done

    Optional<List<Hotel>> findByHotelPhone(String phone); // done

    Optional<List<Hotel>> findByHotelEmail(String email); // done

    Optional<List<Hotel>> findByHotelWebsite(String website); // done

    Optional<List<Hotel>> findByHotelDescription(String description); // done

    List<Hotel> findAllHotels(); // done

    Hotel updateHotel(String id, Hotel hotel); //

    void deleteHotel(String id); //

}
