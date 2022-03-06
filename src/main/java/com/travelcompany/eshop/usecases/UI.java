package com.travelcompany.eshop.usecases;

import com.travelcompany.eshop.service.CustomerService;
import java.util.Scanner;

public class UI {
    public void initiateUserInterface(){
        CustomerService customerService = new CustomerService();
        Scanner in = new Scanner(System.in);

        TicketCreation ticketCreationUI = new TicketCreation();
        ticketCreationUI.ticketCreationUI();
        CustomerCreation customerCreationUI = new CustomerCreation();
        customerCreationUI.customerCreation();
        System.out.println("Give customer id");
        int custID = in.nextInt();
        System.out.println("Give ticket id");
        int tickID = in.nextInt();
}

    public void initiateUserIN() {
    }
 System.out.println(CustomerService.customerService.buyTicketViaCash(customerid, tickerid));
        System.out.println(customerService.findCustomer(custID));
}
