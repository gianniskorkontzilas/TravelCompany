package com.travelcompany.eshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Customer {

    protected String Nationality;
    private int id ;
    private String Type;
    protected String Firstname;
    protected String Lastname;
    protected String Email;
    protected String Address;
    protected String nationality;
    private double credit;
    private boolean status;
    private int ticketsPurchased = 0;
    protected BigDecimal Balance = BigDecimal.ZERO;
    private BigDecimal ticketsPurchasedPrice = BigDecimal.ZERO;

    public Customer(String Firstname, String Lastname, String Email, String Address, String nationality, BigDecimal Balance) {
        this.Firstname = Firstname;
        this.Lastname = Lastname;
        this.Email = Email;
        this.Address = Address;
        this.Nationality = nationality;

        this.Balance = Balance;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String Lastname) {this.Lastname = Lastname;}

    public String getEmail() {return Email;}

    public void setEmail(String Email) {this.Email = Email;}

    public String getAddress() {return Address();}

    private @Nullable String Address() {return null;}

    public void setAddress(String Address) {this.Address = Address;}

    public String getNationality() {return Nationality;}

    public void setNationality(String Nationality) {this.Nationality = Nationality;}

    public BigDecimal getBalance() {return Balance;}

    public void setBalance(BigDecimal Balance) {this.Balance = Balance;}

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public int getTicketsPurchased() {return ticketsPurchased;}

    public void setTicketsPurchased(int ticketsPurchased) {this.ticketsPurchased = ticketsPurchased;}

    public BigDecimal getTicketsPurchasedPrice() {return ticketsPurchasedPrice;}

    public void setTicketsPurchasedPrice(BigDecimal ticketsPurchasedPrice) {this.ticketsPurchasedPrice = ticketsPurchasedPrice;}

    public String getType() {return Type;}

    public void setType(String Type) {this.Type = Type;}

}





