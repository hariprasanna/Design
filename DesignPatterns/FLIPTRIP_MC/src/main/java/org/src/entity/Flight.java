package org.src.entity;

import org.src.enums.Airline;
import org.src.enums.City;
import sun.security.provider.certpath.Builder;

public class Flight {
    private final int id;
    private final City source;
    private final City destination;
    private final Airline airline;
    private final double price;

    public Flight(Builder builder) {
        this.id = builder.id;
        this.source = builder.source;
        this.destination = builder.destination;
        this.price = builder.price;
        this.airline = builder.airline;
    }

    public static class Builder {
        private int id;
        private City source;
        private City destination;
        private Airline airline;
        private double price;
        public static Builder getInstance() {
            return new Builder();
        }
        public Builder id(int id) {
            this.id = id;
            return this;
        }
        public Builder source(City source) {
            this.source = source;
            return this;
        }
        public Builder posDestination(City destination) {
            this.destination = destination;
            return this;
        }
        public Builder airline(Airline airline) {
            this.airline = airline;
            return this;
        }
        public Builder price(double price) {
            this.price = price;
            return this;
        }
        public Flight build() {
            return new Flight(this);
        }
    }

    public int getId() {
        return id;
    }

    public City getSource() {
        return source;
    }

    public City getDestination() {
        return destination;
    }

    public Airline getAirline() {
        return airline;
    }

    public double getPrice() {
        return price;
    }
}
