package com.kodilla.good.patterns.challenges.flights.repository;

import com.kodilla.good.patterns.challenges.flights.flight.Flight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class FlightsRepository implements Repository {

    private List<Flight> directFlights = new ArrayList<>();

    public FlightsRepository(List<Flight> flights) {

        if (flights != null) {
            directFlights = flights.stream().collect(Collectors.toList());
        } else {
            directFlights = null;
        }
    }

    public List<Flight> getFlights() {
        return directFlights;
    }
}
