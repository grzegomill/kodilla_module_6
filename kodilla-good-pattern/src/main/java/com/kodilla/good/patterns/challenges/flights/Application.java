package com.kodilla.good.patterns.challenges.flights;

import com.kodilla.good.patterns.challenges.flights.flight.Flight;
import com.kodilla.good.patterns.challenges.flights.flight.FlightService;
import com.kodilla.good.patterns.challenges.flights.repository.FlightsRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {

        final List<Flight> flights = new ArrayList<>();

        flights.add(new Flight("GDAŃSK", "WARSZAWA"));
        flights.add(new Flight("GDAŃSK", "POZNAŃ"));
        flights.add(new Flight("WARSZAWA", "KRAKÓW"));
        flights.add(new Flight("WARSZAWA", "KATOWICE"));
        flights.add(new Flight("WARSZAWA", "OLSZTYN"));
        flights.add(new Flight("POZNAŃ", "WROCŁAW"));
        flights.add(new Flight("KATOWICE", "RZESZÓW"));
        flights.add(new Flight("WROCŁAW", "LÓDŹ"));
        flights.add(new Flight("KATOWICE", "LÓDŹ"));
        flights.add(new Flight("LÓDŹ", "WROCŁAW"));
        flights.add(new Flight("WROCŁAW", "WARSZAWA"));

        String from = "GDAŃSK", directTo = "WARSZAWA", to;

        final FlightService flightService = new FlightService(new FlightsRepository(flights));


        final List<Flight> flightsFrom = flightService.findDirectFlightsFrom(from);

        System.out.println("Flights from: " + from);

        if (flightsFrom != null && flightsFrom.size() > 0) {
            flightsFrom.stream()
                    .map(f -> f.getFrom() + " -> " + f.getTo())
                    .forEach(System.out::println);
        } else {
            System.out.println("No available flights");
        }


        final List<Flight> flightsTo = flightService.findDirectFlightsTo(directTo);

        System.out.println("\nFlights to: " + directTo);

        if (flightsTo != null && flightsTo.size() > 0) {

            flightsTo
                    .stream()
                    .map(f -> f.getFrom() + " -> " + f.getTo())
                    .forEach(System.out::println);
        } else {
            System.out.println("No available flights");
        }


        from = "GDAŃSK";
        to = "LÓDŹ";

        System.out.println("\nFlights from: " + from + " to: " + to);

        final List<List<Flight>> flightsList = flightService.findFlightsFromTo(from, to);

        if (flightsList != null && flightsList.size() > 0) {

            for (List<Flight> listOfFlights : flightsList) {

                System.out.println(

                        listOfFlights.stream()
                                .map(f -> f.getFrom() + " -> " + f.getTo())
                                .collect(Collectors.joining(" , "))
                );

            }

        } else {
            System.out.println("No available flights");
        }


    }
}
