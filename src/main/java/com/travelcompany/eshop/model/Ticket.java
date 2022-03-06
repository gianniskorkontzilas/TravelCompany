package com.travelcompany.eshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {
    private int id;
    private int PassengerId;
    private int itineraryId;
    private String paymentMethod;
    private BigDecimal PaymentAmount;
    private BigDecimal paymentAmount;

    public Ticket(String destination, String departure, String departureDate, String airline, BigDecimal basic) {

    }

    public void Itinerary(int PassengerId, int itineraryId, String paymentMethod, BigDecimal paymentAmount) {
        this.PassengerId = PassengerId;
        this.itineraryId = itineraryId;
        this.paymentMethod = paymentMethod;
        this.paymentAmount = paymentAmount;
    }
}

    