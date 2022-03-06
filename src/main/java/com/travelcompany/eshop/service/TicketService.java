package com.travelcompany.eshop.service;

import com.travelcompany.eshop.enumer.AirportCodes;
import com.travelcompany.eshop.exception.CustomerException;
import com.travelcompany.eshop.model.Ticket;
import com.travelcompany.eshop.repository.TicketRepoimpl;
import gr.codehub.eshop.exception.CustomerException;

import java.math.BigDecimal;

public class TicketService {
    public class TicketService {
        TicketRepoimpl ticketRepository = new TicketRepoimpl();
        public String createNewTicket (String Destination, String Departure, String DepartureDate, String Airline, BigDecimal Basic) throws CustomerException{
            if (checkDestinationAirportCode(Destination) && checkDepartureAirportCode(Departure)){
            Ticket ticket = new Ticket(Destination, Departure, DepartureDate, Airline, Basic);
                ticketRepository.createTicket(ticket);
                else throw new CustomerException("Codes for Departure and Destination");

            }

            public String findTicket(int customerID){
                try { return ticketrepo.readTicket().toString();
                }   catch (NullPointerException e){
                    String s = "Customer does not exist";
                    return s;
                }
            }

            public Boolean checkDestinationAirportCode (String Code){
                AirportCodes airports[] = AirportCodes.values();
                for (AirportCodes airportCodes: airports){
                    if (airportCodes.name().equals(code)){
                        return true;
                    }
                }
                return false;
            }

            public Boolean checkDepartureAirportCode (String code){
                AirportCodes airports[] = AirportCodes.values();
                for (AirportCodes airportCodes: airports){
                    if (airportCodes.name().equals(code)){
                        return true;
                    }
                }
                return false;
            }
            public String showTickets(){ return ticketRepository.readTicket().toString();
        }

    }
