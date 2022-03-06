package com.travelcompany.eshop.usecases;

import com.travelcompany.eshop.exception.CustomerException;
import com.travelcompany.eshop.service.TicketService;

import static java.lang.Boolean.TRUE;
import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicketCreation {

    private final TicketService ticketService = new TicketService();

    public void ticketCreationUI(){
        Scanner in = new Scanner(System.in);

        String Destination;
        String Departure;
        String DepartureDate;
        String Airline;
        BigDecimal Basic = BigDecimal.ZERO;

        System.out.println("Insert destination code");
        Destination = in.nextLine();
        System.out.println("Insert departure code");
        Departure = in.nextLine();
        System.out.println("Insert departuredate ");
        Departure = in.nextLine();
        System.out.println("Insert airline");
        Airline = in.nextLine();
        System.out.println("Insert price");
        try{ Basic = in.nextBigDecimal();
        } catch (InputMismatchException e){
            System.out.println("Insert a valid number");
            return;
        }
        try { ticketService.createNewTicket(Destination, Departure, DepartureDate, Airline, Basic);
        } catch (CustomerException e){
            System.out.println("Destination Airport Code Not Valid");
        }

        System.out.println(ticketService.showTickets());
    }
}
