package com.travelcompany.eshop.repository;

import com.travelcompany.eshop.model.Ticket;
import java.util.List;

public interface TicketRepo {

    void createTicket(Ticket ticket);
    Ticket readTicket(int ticketID);
    static List<Ticket> readTicket();
    String updateTicket();
    Boolean deleteTicket();
}

