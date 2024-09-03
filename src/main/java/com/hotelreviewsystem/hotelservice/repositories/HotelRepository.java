package com.hotelreviewsystem.hotelservice.repositories;

import com.hotelreviewsystem.hotelservice.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,String> {

    Optional<List<Hotel>> findByHotelName(String name);
    Optional<List<Hotel>> findByHotelAddress(String address);
    Optional<List<Hotel>> findByHotelCity(String city);
    Optional<List<Hotel>> findByHotelState(String state);
    Optional<List<Hotel>> findByHotelCountry(String country);
    Optional<List<Hotel>> findByHotelPhone(String phone);
    Optional<List<Hotel>> findByHotelEmail(String email);
    Optional<List<Hotel>> findByHotelWebsite(String website);
    Optional<List<Hotel>> findByHotelDescription(String description);
}
