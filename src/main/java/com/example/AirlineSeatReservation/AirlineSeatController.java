package com.example.AirlineSeatReservation;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AirlineSeatController {

    private final AirlineSeatService airlineSeatService;

    public AirlineSeatController(AirlineSeatService airlineSeatService) {
        this.airlineSeatService = airlineSeatService;
    }

    @PostMapping("/seats/available")
    public void viewAvailableSeats() {
        airlineSeatService.viewAvailableSeats();
    }

    @PostMapping("/seats/reserve")
    public void reserveSeat() {
        airlineSeatService.reserveSeat();
    }

    @PostMapping("/reservation/details")
    public void reservationDetails() {
        airlineSeatService.reservationDetails();
    }
}