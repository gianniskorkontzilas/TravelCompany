package com.travelcompany.eshop.service;
import com.travelcompany.eshop.exception.CustomerException;
import com.travelcompany.eshop.model.BusinessCustomer;

import static com.travelcompany.eshop.model.BusinessCustomer.BUSINESSCUSTOMERDISCOUNT;
import static com.travelcompany.eshop.model.Customer.CREDITCARDDISCOUNT;

import com.travelcompany.eshop.model.Customer;
import com.travelcompany.eshop.model.IndividualCustomer;

import static com.travelcompany.eshop.model.Customer.CREDITCARDDISCOUNT;
import static com.travelcompany.eshop.model.IndividualCustomer.INDIVIDUAL_CUSTOMER_SURCHARGE;
import static com.travelcompany.eshop.model.Individualcustomer.INDIVIDUALCUSTOMER;

import com.travelcompany.eshop.repository.CustomerRepoimpl;
import com.travelcompany.eshop.repository.TicketRepoimpl;
import java.math.BigDecimal;


public class CustomerService {
    public void createNewBusinessCustomer(String firstname, String lastname, String email, String address, String nationality, BigDecimal balance) {
    }

    public void createNewIndividualCustomer(String firstname, String lastname, String email, String address, String nationality, BigDecimal balance) {
    }

    public boolean showCustomer() {
        return false;
    }

    public class customerService {
        CustomerRepoimpl customerRepository = new CustomerRepoimpl();
        TicketRepoimpl ticketRepository = new TicketRepoimpl();
        public void createNewBusinessCustomer(String firstname, String lastsurname, String email, String address, String nationality, BigDecimal balance) throws InvalidFormException{
            if (email.endsWith("@travelcompany.com")){
                throw new CustomerException("wrong email, email cannnot end with @travelcompany.com");
            }
            else {
                BusinessCustomer customer = new BusinessCustomer(firstname, lastname, email, address, nationality, balance);
                customerRepository.createCustomer(customer);
            }
        }
        public String createNewIndividualCustomer(String firstname, String lastname, String email, String address, String nationality, BigDecimal balance) throws InvalidFormException{
            if (email.endsWith("@travelcompany.com")){
                throw new CustomerException("wrong email, email cannnot end with @travelcompany.com");
            }
            else {
                Individualcustomer customer = new Individualcustomer(firstname, lastname, email, address, nationality, balance);
                customerRepository.createCustomer(Customer);
            }
            public String findCustomer(int customerID){
                try { return customerRepository.readCustomer().toString();
                }   catch (NullPointerException e){
                    return ("Customer does not exist");
                }
            }

            public String showCustomers(){
                return customerRepository.readCustomer().toString();
            }

            public String buyTicketViaCash (int customerID, int ticketID){
                try{ customerRepository.readCustomer(customerID);
                } catch (NullPointerException e){
                    return ("Customer Not Found");
                }
                try{ ticketRepository.readTicket(ticketID);
                } catch (NullPointerException e){
                    return ("Ticket Not Found");
                }
                if(customerRepository.readCustomer(customerID).getType().equals("Business")){
                    customerRepository.readCustomer(customerID).setBalance
                            (customerRepository.readCustomer(customerID).getBalance().subtract
                                    (ticketRepository.readTicket(ticketID).getBasic().multiply(BUSINESSCUSTOMERDISCOUNT)));
                    return ("Ticket Bought!");
                }
                else customerRepository.readCustomer(customerID).setBalance
                        (customerRepository.readCustomer(customerID).getBalance().subtract
                                (ticketRepository.readTicket(ticketID).getBasic().multiply(INDIVIDUALCUSTOMER)));
                return ("Ticket Bought!");
            }


            public String buyTicketViaCreditCard (int customerID, int ticketID){
                try{ customerRepository.readCustomer(customerID);
                } catch (NullPointerException e){
                    return ("Customer Not Found");
                }
                try{ ticketRepository.readTicket(ticketID);
                } catch (NullPointerException e){
                    return ("Ticket Not Found");
                }
                if(customerRepository.readCustomer(customerID).getType().equals("Business")){
                    customerRepository.readCustomer(customerID).setBalance
                            (customerRepository.readCustomer(customerID).getBalance().subtract
                                    (ticketRepository.readTicket(ticketID).getBasic().multiply(BUSINESSCUSTOMERDISCOUNT)).multiply(CREDITCARDDISCOUNT));
                    return ("Ticket Bought!");
                }
                else customerRepository.readCustomer(customerID).setBalance
                        (customerRepository.readCustomer(customerID).getBalance().subtract
                                (ticketRepository.readTicket(ticketID).getBasic().multiply(INDIVIDUALCUSTOMER)).multiply(CREDITCARDDISCOUNT));
                return ("Ticket Bought!");
            }

        }
