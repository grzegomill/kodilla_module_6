package com.kodilla.good.patterns.challenges.flights.repository;

import com.kodilla.good.patterns.challenges.flights.flight.Flight;

import java.util.ArrayList;
import java.util.List;

public class FlightsRepository implements Repository {

    private final List<Flight> directFlights = new ArrayList<>();

    public FlightsRepository() {

        directFlights.add(new Flight("GDAŃSK", "WARSZAWA"));
        directFlights.add(new Flight("GDAŃSK", "POZNAŃ"));
        directFlights.add(new Flight("WARSZAWA", "KRAKÓW"));
        directFlights.add(new Flight("ŁÓDŹ", "WARSZAWA"));
        directFlights.add(new Flight("WARSZAWA", "KATOWICE"));
        directFlights.add(new Flight("WARSZAWA", "OLSZTYN"));
        directFlights.add(new Flight("POZNAŃ", "WROCŁAW"));
        directFlights.add(new Flight("KATOWICE", "RZESZÓW"));
        directFlights.add(new Flight("WROCŁAW", "WARSZAWA"));

    }

    public List<Flight> getFlights() {
        return directFlights;
    }
}
