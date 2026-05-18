package com.example.AirlineSeatReservation;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.junit.jupiter.api.Test;

public class AirlineSeatControllerTest {

    @Test
    public void testViewAvailableSeats() {
        AirlineSeatService service = new AirlineSeatService();
        AirlineSeatController controller = new AirlineSeatController(service);

        assertDoesNotThrow(controller::viewAvailableSeats);
    }

    @Test
    public void testReserveSeat() {
        AirlineSeatService service = new AirlineSeatService();
        AirlineSeatController controller = new AirlineSeatController(service);

        assertDoesNotThrow(controller::reserveSeat);
    }

    @Test
    public void testReservationDetails() {
        AirlineSeatService service = new AirlineSeatService();
        AirlineSeatController controller = new AirlineSeatController(service);

        assertDoesNotThrow(controller::reservationDetails);
    }
}