package com.travelcompany.eshop.usecases;

import com.travelcompany.eshop.exception.CustomerException;
import com.travelcompany.eshop.service.CustomerService;
import gr.codehub.eshop.exception.CustomerException;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;
public class CustomerCreation {
    public class customerCreation {
        private final CustomerService customerService = new CustomerService();

        public void customerCreationUI() {
            Scanner in = new Scanner(System.in);
            String firstname;
            String lastname;
            String email;
            String address;
            String nationality;
            BigDecimal balance = BigDecimal.ZERO;


            System.out.println("Welcom, Insert your firstname");
            firstname = in.nextLine();
            System.out.println("Insert your lastname");
            lastname = in.nextLine();
            System.out.println("Insert your email");
            email = in.nextLine();
            System.out.println("Insert your address");
            address = in.nextLine();
            System.out.println("Insert your nationality");
            nationality = in.nextLine();
            System.out.println("Insert your balance");
            try{ balance = in.nextBigDecimal();
            } catch (InputMismatchException e) {
                System.out.println("Insert a valid number");
                return;
            }
            System.out.println("Business customer or an Individual customer?");
            System.out.println("Press yes for Business or no for Individual");
            int keystroke = in.nextInt();
            switch (keystroke){

                case 1 -> {
                    //Tries to create a new BusinessCustomer, if email is invalid it handles the exception
                    try{customerService.createNewBusinessCustomer(firstname, lastname, email, address, nationality, balance);
                    }catch(CustomerException){
                        System.out.println("Customer email cannot end with @travelcompany.com");
                    }
                }
                case 2 -> {
                    //Tries to create a new IndividualCustomer, if email is invalid it handles the exception
                    try{customerService.createNewIndividualCustomer(firstname, lastname, email, address, nationality, balance);
                    }catch(CustomerException e{
                        System.out.println("Customer email cannot end with @travelcompany.com");
                    }
                }
            }
            System.out.println(customerService.showCustomer());
        }
    }
