package com.hotelreviewsystem.hotelservice.controllers;
import com.hotelreviewsystem.hotelservice.dtos.HotelDto;
import com.hotelreviewsystem.hotelservice.dtos.mappers.HotelRequestDto;
import com.hotelreviewsystem.hotelservice.entities.Hotel;
import com.hotelreviewsystem.hotelservice.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private HotelService hotelService;


    @PostMapping("/create")
     public ResponseEntity<Hotel> saveHotel(@RequestBody HotelDto hotelDto) {
         Hotel hotel = HotelRequestDto.convertHotelRequestDtotoHotel(hotelDto);
         Hotel savedHotel = hotelService.saveHotel(hotel);
         return ResponseEntity.ok(savedHotel);
     }

     @GetMapping("/getHotel/{id}")
     public ResponseEntity<Optional<Hotel>> findHotelById(@PathVariable String id) {
        Optional<Hotel> hotel = hotelService.findHotelById(id);
        return new ResponseEntity<>(hotel, HttpStatus.FOUND);
     }


     @GetMapping("/hotelName/{hotelName}")
     public ResponseEntity<Optional<List<Hotel>>> findHotelByName(@PathVariable String hotelName) {
         Optional<List<Hotel>> hotel = hotelService.findByHotelName(hotelName);
         return new ResponseEntity<>(hotel, HttpStatus.FOUND);
     }

     @GetMapping("/hotelAddress/{hotelAddress}")
     public ResponseEntity<Optional<List<Hotel>>> findByHotelAddress(@PathVariable String hotelAddress) {
        Optional<List<Hotel>> hotel = hotelService.findByHotelAddress(hotelAddress);
        return new ResponseEntity<>(hotel, HttpStatus.FOUND);
     }


     @GetMapping("/hotelCity/{hotelCity}")
     public ResponseEntity<Optional<List<Hotel>>> findByHotelCity(@PathVariable String hotelCity) {
        Optional<List<Hotel>> hotel = hotelService.findByHotelCity(hotelCity);
        return new ResponseEntity<>(hotel, HttpStatus.FOUND);
     }

     @GetMapping("/hotelState/{hotelState}")
     public ResponseEntity<Optional<List<Hotel>>> findByHotelState(@PathVariable String hotelState) {
        Optional<List<Hotel>> hotel = hotelService.findByHotelState(hotelState);
        return new ResponseEntity<>(hotel, HttpStatus.FOUND);
     }


     @GetMapping("/hotelCountry/{hotelCountry}")
    public ResponseEntity<Optional<List<Hotel>>> findByHotelCountry(@PathVariable String hotelCountry) {
        Optional<List<Hotel>> hotel = hotelService.findByHotelCountry(hotelCountry);
        return new ResponseEntity<>(hotel, HttpStatus.FOUND);
     }

     @GetMapping("/hotelPhone/{hotelPhone}")
     public ResponseEntity<Optional<List<Hotel>>> findByHotelPhone(@PathVariable String hotelPhone) {
         Optional<List<Hotel>> hotel = hotelService.findByHotelPhone(hotelPhone);
         return new ResponseEntity<>(hotel, HttpStatus.FOUND);
     }

     @GetMapping("/hotelEmail/{hotelEmail}")
     public ResponseEntity<Optional<List<Hotel>>> findByHotelEmail(@PathVariable String hotelEmail) {
         Optional<List<Hotel>> hotel = hotelService.findByHotelEmail(hotelEmail);
         return new ResponseEntity<>(hotel, HttpStatus.FOUND);
     }

     @GetMapping("/hotelWebsite/{hotelWebsite}")
     public ResponseEntity<Optional<List<Hotel>>> findByHotelWebsite(@PathVariable String hotelWebsite) {
        Optional<List<Hotel>> hotel = hotelService.findByHotelWebsite(hotelWebsite);
        return new ResponseEntity<>(hotel, HttpStatus.FOUND);
     }


     @GetMapping("/hotelDescription/{hotelDescription}")
     public ResponseEntity<Optional<List<Hotel>>> findByHotelDescription(@PathVariable String hotelDescription) {
        Optional<List<Hotel>> hotel = hotelService.findByHotelDescription(hotelDescription);
        return new ResponseEntity<>(hotel, HttpStatus.FOUND);
     }


     @GetMapping("allHotels")
     public ResponseEntity<List<Hotel>> findAllHotels() {
        List<Hotel> hotels = hotelService.findAllHotels();
        return new ResponseEntity<>(hotels, HttpStatus.FOUND);
     }

     @PutMapping("/updateHotel/{hotelId}")
     public ResponseEntity<Hotel> updateHotel(@RequestBody HotelDto hotelDto,@PathVariable("hotelId") String id) {
         Hotel hotel = HotelRequestDto.convertHotelRequestDtotoHotel(hotelDto);
         hotelService.updateHotel(id, hotel);
         return new ResponseEntity<>(hotel, HttpStatus.OK);
     }
}
