package com.travelcompany.eshop.model;

import com.travelcompany.eshop.model.Customer;

import java.math.BigDecimal;
import java.util.Date;


public class BusinessCustomer extends Customer { ;
    public final String customerType = ("Business");
    public static final BigDecimal BUSINESSCUSTOMERDISCOUNT = new BigDecimal("0.10");

    public BusinessCustomer(String Firstname, String Lastname,String Email,String Address, Date Nationality, BigDecimal balance) {
        super(Firstname, Lastname, Email, Address, String.valueOf(Nationality), balance);
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