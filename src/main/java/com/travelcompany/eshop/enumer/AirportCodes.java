package com.travelcompany.eshop.enumer;

public enum AirportCodes {
    ATH("Athens"), PAR("Paris"), LON("London"), AMS("Amsterdam"), DUB("Dublin"), FRA("Frankfurt"), MEX("Mexico");

    private String airportName;

    private AirportCodes(String airportName){
        this.airportName = airportName;
    }
}
}
