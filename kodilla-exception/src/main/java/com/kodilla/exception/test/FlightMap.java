package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public final class FlightMap {

    private final Map<String, Boolean> availableDestination = new HashMap<>();

    public FlightMap() {

        availableDestination.put("Berlin", true);
        availableDestination.put("Moscow", false);
        availableDestination.put("Paris", true);
        availableDestination.put("Roma", true);
        availableDestination.put("Madrid", true);
        availableDestination.put("Amsterdam", true);
        availableDestination.put("Vienna", true);
        availableDestination.put("London", true);

    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        return availableDestination.entrySet().stream()
                .filter(fm -> fm.getKey().equals(flight.getArrivalAirport()))
                .findFirst()
                .map(p -> p.getValue())
                .orElseThrow(() -> new RouteNotFoundException("Flight to " + flight.getArrivalAirport() + " does not exist!"));

    }
}
