package com.travelcompany.eshop.repository;
import com.travelcompany.eshop.model.Ticket;
import java.util.ArrayList;
import java.util.List;


public class TicketRepoimpl implements TicketRepo {
    ArrayList<Ticket> ticketList = new ArrayList();
    private static int ticketID;


    @Override
    public void createTicket(Ticket ticket) {
        ticketList.add(ticket);
        ticket.setId(++ticketID);
    }

    @Override
    public Ticket readTicket(int ticketID) throws NullPointerException {
        for (Ticket ticket: ticketList){
            if (ticketID == ticket.getId()) return ticket;
        }
        return null;
    }


    @Override
    public List<Ticket> readTicket() {
        return ticketList;
    }


    @Override
    public String updateTicket(int id, int passengerId) {
        Ticket ticket = readTicket(id);
        if(Ticket == null)
            return false;
        ticket.SetPassengerid(newpassengerid)
        return true;


    @Override
    public Boolean deleteTicket(int id, int newpassengerid) throws com.travelcompany.eshop.exception.{
        Ticket ticket = readTicket(id)
        if(ticket == null)
            throw new com.travelcompany.eshop.exception();
        tickets.remove(ticket);
        return true;
    }
