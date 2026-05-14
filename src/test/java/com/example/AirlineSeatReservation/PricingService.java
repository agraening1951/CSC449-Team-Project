package com.example.AirlineSeatReservation;

import com.example.AirlineSeatReservation.PricingService;
import java.util.HashMap;
import java.util.Map;


public class PricingService {

    private final Map<String, Double> pricing = new HashMap<>();

    public PricingService() {
        // Default pricing options
        pricing.put("Economy", 150.00);
        pricing.put("Business", 350.00);
        pricing.put("First", 600.00);
    }

    public Map<String, Double> getPricingOptions() {
        return pricing;
    }

    public void setPrice(String seatClass, double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        pricing.put(seatClass, price);
    }

    public void updatePrice(String seatClass, double newPrice) {
        if (newPrice < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        pricing.put(seatClass, newPrice);
    }

    public double getPrice(String seatClass) {
        return pricing.get(seatClass);
    }
}
