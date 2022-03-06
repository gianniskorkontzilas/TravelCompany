package com.travelcompany.eshop.repository;
import com.travelcompany.eshop.model.Itinerary;

import javax.print.attribute.standard.Destination;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class ItineraryRepoimpl implements Itinerary {

    List<Itinerary> Itineraries = new ArrayList<>();

    @Override
    public Itinerary CreateItinerary(String code, String DepartureCode, String DestinationCode, String Airline, Date DepartureDate, BigDecimal basicPrice) throws ItineraryAirportCodeNotFoundException {
        if (DepartureCode == null)
            throw new Departurecode();
        }
        Itinerary itinerary = new Itinerary(code, DepartureCode, airline, departureDate, basicPrice);
        Itineraries.add(itinerary);
        return itinerary;
}

    public ItineraryRepoImpl() {
        PopulateItineraryRepo();
}

    @Override
    public List<Itinerary> GetItineraries() {

        return Itineraries;
    }

    @Override
    public void PopulateItineraryRepo() {
        Instant instant = Instant.parse("2022-03-06T15:35:00.00Z");;
        try {
            Object Departurecode;
            CreateItinerary("1", Departurecode.ATH, Destinationcode.PAR, "SkyLines", Date.from(instant), new BigDecimal("300"));
            CreateItinerary("2", Departurecode.ATH, Destinationcode.LON, "SkyLines", Date.from(instant), new BigDecimal("420"));
            CreateItinerary("3", Departurecode.ATH, Destinationcode.AMS, "SkyLines", Date.from(instant), new BigDecimal("280"));
            CreateItinerary("4", Departurecode.ATH, Destinationcode.PAR, "SkyLines", Date.from(instant), new BigDecimal("310"));
            CreateItinerary("5", Departurecode.Ath, Destinationcode.DUB, "SkyLines", Date.from(instant), new BigDecimal("880"));
            CreateItinerary("6", Departurecode.ATH, Destinationcode.FRA, "SkyLines", Date.from(instant), new BigDecimal("380"));
            CreateItinerary("7", Departurecode.ATH, Destinationcode.FRA, "SkyLines", Date.from(instant), new BigDecimal("350"));
            CreateItinerary("8", Departurecode.ATH, Destinationcode.MEX, "SkyLines", Date.from(instant), new BigDecimal("1020"));
            CreateItinerary("9", Departurecode.ATH, Destinationcode.DUB, "SkyLines", Date.from(instant), new BigDecimal("770"));
        }   catch (DeparturecodeNotFoundException e) {
            System.out.println("whatever I dont care exception caught");
        }
    }

}