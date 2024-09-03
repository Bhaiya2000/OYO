package com.hotelreviewsystem.hotelservice.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "hotel")
public class Hotel {
    @Id
    private String hotelId;
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

