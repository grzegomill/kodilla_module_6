package com.kodilla.good.patterns.challenges.flights.repository;

import com.kodilla.good.patterns.challenges.flights.flight.Flight;

import java.util.List;

public interface Repository {

    List<Flight> getFlights();
}
