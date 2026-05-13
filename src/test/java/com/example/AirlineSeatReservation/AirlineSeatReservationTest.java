package com.example.AirlineSeatReservation;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.junit.jupiter.api.Test;

public class AirlineSeatReservationTest {
    @Test
    public void testReserveSeat() {
        AirlineSeatService AirlineSeatService = new AirlineSeatService();
        assertDoesNotThrow(AirlineSeatService::reserveSeat);
    }
    @Test
    public void testDisplayReservation() {
        AirlineSeatService AirlineSeatService = new AirlineSeatService();
        assertDoesNotThrow(AirlineSeatService::reservationDetails);
    }
}