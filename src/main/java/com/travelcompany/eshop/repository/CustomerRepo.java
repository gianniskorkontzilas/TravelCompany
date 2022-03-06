package com.travelcompany.eshop.repository;

import com.travelcompany.eshop.model.Customer;
import java.util.List;


public interface CustomerRepo {
    void createCustomer(Customer customer);
    Customer readCustomer(int customerID);
    List<Customer> readCustomer();
    String updateCustomer(int customerID);
    Boolean deleteCustomer(int customerID);
}