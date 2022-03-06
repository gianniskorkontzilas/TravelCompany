package com.travelcompany.eshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Itinerary {
    private int id;
    private String Destination;
    private String Departure ;
    private String DepartureDate;
    private String Airline;
    private BigDecimal BasicPrice;


    public Itinerary(String Destination, String Departure, String DepartureDate, String Airline, BigDecimal BasicPrice) {
        this.Destination = Destination;
        this.Departure = Departure;
        this.DepartureDate = DepartureDate;
        this.Airline = Airline;
        this.BasicPrice = BasicPrice;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    public String getDeparture() {
        return Departure;
    }

    public void setDeparture(String Departure) {
        this.Departure = Departure;
    }

    public String getDepartureDate() {
        return DepartureDate;
    }

    public void setDepartureDate(String DepartureDate) {
        this.DepartureDate = DepartureDate;
    }

    public String getAirline() {
        return Airline;
    }

    public void setAirline(String Airline) {
        this.Airline = Airline;
    }

    public BigDecimal getBasicPrice() {
        return BasicPrice;
    }

    public void setBasicPrice(BigDecimal BasicPrice) {
        this.BasicPrice = BasicPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ID = " + id +  ", DESTINATION AIRPORT CODE = " + Destination + ", DEPARTURE AIRPORT CODE = " + Departure + ", Departure Date = " + DepartureDate + ", airline=" + Airline + ", Basic Price " + BasicPrice + System.lineSeparator();
    }



}