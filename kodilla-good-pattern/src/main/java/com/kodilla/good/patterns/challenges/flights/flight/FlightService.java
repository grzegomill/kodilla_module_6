package com.kodilla.good.patterns.challenges.flights.flight;

import com.kodilla.good.patterns.challenges.flights.repository.Repository;

import java.util.List;
import java.util.stream.Collectors;

public class FlightService {

    private Repository repository;

    public FlightService(Repository repository) {
        this.repository = repository;
    }


    public List<Flight> findDirectFlightsFrom(String from) {

        return repository.getFlights()
                .stream()
                .filter(v -> v.getFrom().equals(from))
                .collect(Collectors.toList());
    }


    public List<Flight> findDirectFlightsTo(String to) {

        return repository.getFlights()
                .stream()
                .filter(v -> v.getTo().equals(to))
                .collect(Collectors.toList());

    }

    public void findFlightsFromTo(String from, String to) {


    }

}
