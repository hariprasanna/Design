package org.src.repo;

import org.src.entity.Flight;
import org.src.enums.City;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightRepo {

    Map<City, List<Flight>> flightsFromSource = new HashMap<>();

    public void save(City source, Flight flight) {
        if(flightsFromSource.containsKey(source)) {
            flightsFromSource.get(source).add(flight);
        } else {
            List<Flight> flights = new ArrayList<>();
            flights.add(flight);
        }
    }

    public List<Flight> getAllFlights(City source) {
        return flightsFromSource.get(source);
    }

}
