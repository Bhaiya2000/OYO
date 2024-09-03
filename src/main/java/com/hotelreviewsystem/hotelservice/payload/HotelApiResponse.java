package com.hotelreviewsystem.hotelservice.payload;

import lombok.*;
import org.springframework.http.HttpStatus;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class HotelApiResponse {
    private String message;
    private boolean success;
    private HttpStatus httpStatus;
}
