package com.kodilla.exception.test;

public class FlightMain {

    private static FlightMap flightMap;

    public static void main(String[] args) {

        flightMap = new FlightMap();

        checkFlight(new Flight("Warsaw", "Moscow"));

        checkFlight(new Flight("Warsaw", "Warsaw"));

        checkFlight(new Flight("Warsaw", "Przemyśl"));

        checkFlight(new Flight("Warsaw", "London"));
    }

    private static void checkFlight(Flight flight) {

        String message = "";
        String arrivalAirPort = flight.getArrivalAirport();

        try {
            message = flightMap.findFlight(flight) ? "Flight to " + arrivalAirPort + " is available"
                    : "Flight to " + arrivalAirPort + " is unavailable";
        } catch (RouteNotFoundException e) {
            message = "Flight to " + arrivalAirPort + " does not exist!";
        } finally {
            System.out.println(message);
        }
    }
}
