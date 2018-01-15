package com.kodilla.good.patterns.challenges.flights.flight;

import com.kodilla.good.patterns.challenges.flights.repository.Repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public final class FlightService {

    private final Repository repository;
    private final Set<String> checkedPlaces = new HashSet<>();
    private final List<String> paths = new ArrayList<>();


    public FlightService(final Repository repository) {
        this.repository = repository;
    }


    public List<Flight> findDirectFlightsFrom(String from) {

        List<Flight> flights = repository.getFlights();
        if (flights != null) {
            return flights.stream()
                    .filter(v -> v.getFrom().equals(from))
                    .collect(Collectors.toList());
        }
        return null;
    }


    public List<Flight> findDirectFlightsTo(String to) {

        List<Flight> flights = repository.getFlights();
        if (flights != null) {
            return flights.stream()
                    .filter(v -> v.getFrom().equals(to))
                    .collect(Collectors.toList());
        }
        return null;
    }


    public List<List<Flight>> findFlightsFromTo(final String from, final String to) {

        final List<List<Flight>> flightsList = new ArrayList<>();
        List<Flight> flights;
        Flight flight;

        if (from != null && to != null) {

            this.checkedPlaces.add(from);

            this.getFlights(from, to, "");

            for (String p : paths) {

                String[] s = p.split("#");

                if (s.length > 1) {

                    flights = new ArrayList<>();

                    for (int i = 0; i < s.length - 1; i++) {

                        flight = getDirectFlightFromTo(s[i], s[i + 1]);

                        flights.add(flight);
                    }

                    flightsList.add(flights);
                }
            }

            return flightsList;

        }

        return null;
    }


    private Flight getDirectFlightFromTo(String from, String to) {

        List<Flight> flights = repository.getFlights();

        if (flights != null) {

            List<Flight> flightsTmp = flights.stream()
                    .filter(v -> v.getFrom().equals(from) && v.getTo().equals(to))
                    .limit(1)
                    .collect(Collectors.toList());

            if (flightsTmp.size() > 0) {
                return flightsTmp.get(0);
            }
        }

        return null;
    }

    private void getFlights(String flightDest, final String to, String path) {

        String flightFrom;

        path += path.equals("") ? flightDest : "#" + flightDest;

        if (flightDest.equals(to)) {

            paths.add(path);

        } else {

            List<Flight> flightsList = findDirectFlightsFrom(flightDest);

            if (flightsList != null) {

                for (Flight flight : flightsList) {

                    flightFrom = flight.getTo();

                    if (!checkedPlaces.contains(flightFrom) || flightFrom.equals(to)) {

                        checkedPlaces.add(flightFrom);

                        this.getFlights(flightFrom, to, path);
                    }
                }
            }
        }
    }
}