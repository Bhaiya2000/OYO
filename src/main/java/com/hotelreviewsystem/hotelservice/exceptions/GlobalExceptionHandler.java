package com.hotelreviewsystem.hotelservice.exceptions;


import com.hotelreviewsystem.hotelservice.payload.HotelApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<HotelApiResponse> handlerHotelResourceNotFoundException(ResourceNotFoundException resourceNotFoundException){
        String message = resourceNotFoundException.getMessage();
        HotelApiResponse hotelApiResponse = HotelApiResponse.builder()
                                                             .message(message)
                                                              .success(true)
                                                               .httpStatus(HttpStatus.NOT_FOUND)
                                                                .build();
        return new ResponseEntity<>(hotelApiResponse, HttpStatus.NOT_FOUND);
    }
}
