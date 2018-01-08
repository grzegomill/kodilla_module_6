package com.kodilla.good.patterns.challenges.flights;

import com.kodilla.good.patterns.challenges.flights.flight.Flight;
import com.kodilla.good.patterns.challenges.flights.flight.FlightService;
import com.kodilla.good.patterns.challenges.flights.repository.FlightsRepository;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        String from = "GDAŃSK", to = "WARSZAWA";

        final FlightService flightService = new FlightService(new FlightsRepository());

        final List<Flight> flightsFrom = flightService.findDirectFlightsFrom(from);

        final List<Flight> flightsTo = flightService.findDirectFlightsTo(to);

        System.out.println("Flights from: " + from);
        flightsFrom.stream()
                .map(f -> f.getFrom() + " -> " + f.getTo())
                .forEach(System.out::println);

        System.out.println("\nFlights to: " + to);
        flightsTo.stream()
                .map(f -> f.getFrom() + " -> " + f.getTo())
                .forEach(System.out::println);
    }
}
