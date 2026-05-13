package com.example.AirlineSeatReservation;

import org.springframework.stereotype.Service;
@Service

public class AirlineSeatService {
    public void viewAvailableSeats() {
        System.out.println("Available Seats");
    }
    public void reserveSeat () {
        System.out.println("Seat Reserved");
        }
    public void reservationDetails(){
        System.out.println("Reservation Details:");
    }
}
