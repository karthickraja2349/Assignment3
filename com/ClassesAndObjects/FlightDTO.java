package com.ClassesAndObjects;
public class FlightDTO {

    private static int flightCount = 0;

    private String flightNumber;
    private String airline;
    private String origin;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private double price;
    private int seatsAvailable;

    public FlightDTO(String flightNumber, String airline, String origin, String destination, 
                     String departureTime, String arrivalTime, double price, int seatsAvailable) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.price = price;
        this.seatsAvailable = seatsAvailable;
        flightCount++;
    }

    public static int getFlightCount() {
        return flightCount;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    public void setSeatsAvailable(int seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }

    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("--------------------------------------------------------\n")
          .append(String.format("| %-20s : %-25s|\n", "Flight Number", getFlightNumber()))
          .append(String.format("| %-20s : %-25s|\n", "Airline", getAirline()))
          .append(String.format("| %-20s : %-25s|\n", "Origin", getOrigin()))
          .append(String.format("| %-20s : %-25s|\n", "Destination", getDestination()))
          .append(String.format("| %-20s : %-25s|\n", "Departure Time", getDepartureTime()))
          .append(String.format("| %-20s : %-25s|\n", "Arrival Time", getArrivalTime()))
          .append(String.format("| %-20s : %-25.2f|\n", "Price", getPrice()))
          .append(String.format("| %-20s : %-25d|\n", "Seats Available", getSeatsAvailable()))
          .append("--------------------------------------------------------");
        return sb.toString();
    }
}
