package org.src.service;

import org.src.entity.Flight;

public interface FlightService {
    void registerFlight(String airline, String source, String destination, double price);
    void searchFlight(String source, String destination);
}
