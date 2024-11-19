package org.src.service;

import jdk.internal.util.xml.impl.Pair;
import org.src.entity.Flight;
import org.src.enums.Airline;
import org.src.enums.City;
import org.src.repo.FlightRepo;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FlightServiceImpl implements FlightService {
    FlightRepo flightRepo = new FlightRepo();

    public void registerFlight(String airline, String source, String destination, double price) {
        Flight flight = Flight.Builder.getInstance()
                .id(1)
                .airline(Airline.valueOf(airline))
                .source(City.valueOf(source))
                .posDestination(City.valueOf(destination))
                .price(price)
                .build();
        flightRepo.save(City.valueOf(source), flight);
    }

    public void searchFlight(String source, String destination){

    }

    private void minHops(String source, String destination) {
        //Queue<Pair<String, Double>> q = new LinkedList<>();
        //q.add(new Pair(source, 0));
        /*while(!q.isEmpty()) {
            //String city = q.remove();
            List<Flight> avlFlights = flightRepo.getAllFlights(City.valueOf(city));
            for(Flight flight : avlFlights) {
                if(flight.getDestination() == City.valueOf(destination)) {

                }
            }

        }*/
    }

    private void minCost(String source, String destination) {

    }

}
