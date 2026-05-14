package com.example.AirlineSeatReservation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Map;

public class PricingServiceTest {

    @Test
    void testDisplayPricingOptions() {
        PricingService pricingService = new PricingService();

        Map<String, Double> prices = pricingService.getPricingOptions();

        assertNotNull(prices, "Pricing options should not be null");
        assertFalse(prices.isEmpty(), "Pricing options should not be empty");

        assertTrue(prices.containsKey("Economy"), "Economy class should be listed");
        assertTrue(prices.containsKey("Business"), "Business class should be listed");
        assertTrue(prices.containsKey("First"), "First class should be listed");

        assertTrue(prices.get("Economy") > 0, "Economy price must be positive");
        assertTrue(prices.get("Business") > 0, "Business price must be positive");
        assertTrue(prices.get("First") > 0, "First price must be positive");
    }

    @Test
    void testUpdatePricing() {
        PricingService pricingService = new PricingService();
        pricingService.setPrice("Economy", 150.00);

        pricingService.updatePrice("Economy", 175.00);

        double updatedPrice = pricingService.getPrice("Economy");

        assertEquals(175.00, updatedPrice, 0.01, "Price should update correctly");
    }
}
