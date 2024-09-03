package com.hotelreviewsystem.hotelservice.services.impl;
import com.hotelreviewsystem.hotelservice.entities.Hotel;
import com.hotelreviewsystem.hotelservice.exceptions.ResourceNotFoundException;
import com.hotelreviewsystem.hotelservice.repositories.HotelRepository;
import com.hotelreviewsystem.hotelservice.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel saveHotel(Hotel hotel) {
       String hotelRandomId  =  UUID.randomUUID().toString();
        hotel.setHotelId(hotelRandomId);
        return hotelRepository.save(hotel);
    }


    @Override
    public Optional<Hotel> findHotelById(String id) {
        Optional<Hotel> hotel = hotelRepository.findById(id);
        if(hotel.isEmpty()){
            throw  new ResourceNotFoundException("Hotel not found");
        }
        return hotel;
    }

    @Override
    public Optional<List<Hotel>> findByHotelName(String hotelName) {
        Optional<List<Hotel>> hotel = hotelRepository.findByHotelName(hotelName);
        if(hotel.isEmpty()){
            throw  new ResourceNotFoundException("Hotel not found with this name + : "+hotelName);
        }
        return hotel;
    }

    @Override
    public Optional<List<Hotel>> findByHotelAddress(String address) {
        Optional<List<Hotel>> hotel = hotelRepository.findByHotelAddress(address);
        if(hotel.isEmpty()){
            throw  new ResourceNotFoundException("Hotel not found with this address + : "+address);
        }
        return hotel;
    }

    @Override
   public Optional<List<Hotel>> findByHotelCity(String city) {
        Optional<List<Hotel>> hotel = hotelRepository.findByHotelCity(city);
        if(hotel.isEmpty()){
            throw  new ResourceNotFoundException("Hotel not found with this address + : "+city);
        }
        return hotel;
    }

    @Override
    public Optional<List<Hotel>> findByHotelState(String state){
        Optional<List<Hotel>> hotel = hotelRepository.findByHotelState(state);
        if(hotel.isEmpty()){
            throw  new ResourceNotFoundException("Hotel not found with this address + : "+state);
        }
        return hotel;
    }

    @Override
    public Optional<List<Hotel>> findByHotelCountry(String country) {
        Optional<List<Hotel>> hotel = hotelRepository.findByHotelCountry(country);
        if(hotel.isEmpty()){
            throw  new ResourceNotFoundException("Hotel not found with this address + : "+country);
        }
        return hotel;
    }

    @Override
    public Optional<List<Hotel>> findByHotelPhone(String phone) {
        Optional<List<Hotel>> hotel = hotelRepository.findByHotelPhone(phone);
        if(hotel.isEmpty()){
            throw  new ResourceNotFoundException("Hotel not found with this address + : "+phone);

        }
        return hotel;
    }

    @Override
    public Optional<List<Hotel>> findByHotelEmail(String email) {
        Optional<List<Hotel>> hotel = hotelRepository.findByHotelEmail(email);
        if(hotel.isEmpty()){
            throw  new ResourceNotFoundException("Hotel not found with this address + : "+email);
        }
        return hotel;
    }

    @Override
    public Optional<List<Hotel>> findByHotelWebsite(String website) {
        Optional<List<Hotel>> hotel = hotelRepository.findByHotelWebsite(website);
        if(hotel.isEmpty()){
            throw  new ResourceNotFoundException("Hotel not found with this address + : "+website);
        }
        return hotel;
    }

    @Override
    public Optional<List<Hotel>> findByHotelDescription(String description) {
        Optional<List<Hotel>> hotel = hotelRepository.findByHotelDescription(description);
        if(hotel.isEmpty()){
            throw  new ResourceNotFoundException("Hotel not found with this address + : "+description);
        }
        return hotel;
    }

    @Override
    public List<Hotel> findAllHotels() {
        List<Hotel> hotels = hotelRepository.findAll();
        return hotels;
    }

    @Override
    public Hotel updateHotel(String id, Hotel hotel) {
      Hotel hotel1 = hotelRepository.findById(id).get();
        hotel1.setHotelName(hotel.getHotelName());
        hotel1.setHotelAddress(hotel.getHotelAddress());
        hotel1.setHotelCity(hotel.getHotelCity());
        hotel1.setHotelState(hotel.getHotelState());
        hotel1.setHotelCountry(hotel.getHotelCountry());
        hotel1.setHotelPhone(hotel.getHotelPhone());
        hotel1.setHotelEmail(hotel.getHotelEmail());
        hotel1.setHotelWebsite(hotel.getHotelWebsite());
        hotel1.setHotelDescription(hotel.getHotelDescription());
        Hotel hotel2 = hotelRepository.save(hotel1);
        return hotel2;
    }

    @Override
    public void deleteHotel(String id) {
//      Hotel hotel = hotelRepository.findById(id).get();
//      hotelRepository.delete(hotel);
    }

}
