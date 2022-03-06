package com.travelcompany.eshop.repository;
import com.travelcompany.eshop.model.Itinerary;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


public interface itineraryRepo {

    Itinerary CreateItinerary(String code, String DestinationCode, String DepartureCode, String Airline,  Date DepartureDate, BigDecimal basicPrice);
    List<Itinerary> GetItineraries();
    void PopulateItineraryRepo();

}
