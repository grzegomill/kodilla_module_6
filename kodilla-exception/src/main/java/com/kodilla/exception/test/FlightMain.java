package com.kodilla.exception.test;

public class FlightMain {

    private static FlightMap flightMap = new FlightMap();
    private String message = "";

    public static void main(String[] args) {

        boolean retVal = checkFlight(new Flight("Warsaw", "Moscow"));

        retVal = FlightMain.checkFlight(new Flight("Warsaw", "Warsaw"));

        retVal = FlightMain.checkFlight(new Flight("Warsaw", "Przemyśl"));

        retVal = FlightMain.checkFlight(new Flight("Warsaw", "London"));

    }

    private static boolean checkFlight(Flight flight) {

        boolean retVal = false;

        try {

            retVal = flightMap.findFlight(flight);

            System.out.println(
                    retVal ? "Flight to " + flight.getArrivalAirport() + " is available"
                            : "Flight to " + flight.getArrivalAirport() + " is unavailable");

            return retVal;

        } catch (RouteNotFoundException e) {

            System.out.println("Flight to " + flight.getArrivalAirport() + " does not exist!");

        }

        return retVal;
    }
}
