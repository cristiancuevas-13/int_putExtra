package com.cristian.Satena;

import com.cristian.flight.Flight;

import java.util.ArrayList;
import java.util.Scanner;

public class FlightManager {
    private ArrayList<Flight> flights;

    public FlightManager() {
        flights = new ArrayList<Flight>();
    }

    public void addFlight(String flightNumber, String destination, String departureTime) {
        flights.add(new Flight(flightNumber, destination, departureTime));
        System.out.println("Vuelo añadido con exito.");
    }

    public void updateFlight(String flightNumber, String newDestination, String newDepartureTime) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber().equals(flightNumber)) {
                flight.setDestination(newDestination);
                flight.setDepartureTime(newDepartureTime);
                System.out.println("Vuelo actualizado con exito.");
                return;
            }
        }
        System.out.println("Vuelo no encontrado.");
    }

    public void deleteFlight(String flightNumber) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber().equals(flightNumber)) {
                flights.remove(flight);
                System.out.println("Vuelo eliminado con exito.");
                return;
            }
        }
        System.out.println("Vuelo no encontrado.");
    }

    public void listFlights() {
        if (flights.isEmpty()) {
            System.out.println("No hay vuelos disponibles.");
        } else {
            for (Flight flight : flights) {
                System.out.println(flight);
            }
        }
    }

    public void viewFlight(String flightNumber) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber().equals(flightNumber)) {
                System.out.println(flight);
                return;
            }
        }
        System.out.println("Vuelo no encontrado.");
    }
}