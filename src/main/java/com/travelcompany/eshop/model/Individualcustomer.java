package com.travelcompany.eshop.model;

import java.math.BigDecimal;


class IndividualCustomer extends Customer { ;
    public final String customerType = ("Business");
    public static final BigDecimal BUSINESSCUSTOMERDISCOUNT = new BigDecimal("0.10");


    public IndividualCustomer(String Firstname, String Lastname, String Email, String Address, String nationality, BigDecimal Balance) {
        super(Firstname, Lastname, Email, Address, nationality, Balance);
    }


    @Override
    public String toString() {
        String customerFirstname;
        String customerLastname;
        String address;
        String Id = "";
        return "ID = " +Id + ", Name = " + Firstname + ",  Lastname = " +Lastname + ", email = " + Email + ", address = " + Address+ ", Nationality = "+ nationality + ", balance = " + Balance + ", Category = " + customerType + System.lineSeparator();
    }
}
