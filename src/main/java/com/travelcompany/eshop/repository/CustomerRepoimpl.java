package com.travelcompany.eshop.repository;

import com.travelcompany.eshop.model.customer;
import java.util.ArrayList;
import java.util.List;


public class CustomerRepoimpl implements CustomerRepo{
    private final List<Customer> customers = new ArrayList<>();

    @Override
    public boolean createCustomer(Customer customer) {
        if (customer == null || customer.getName()==null
                || customer.getAddress()==null  || customer.getAddress().equals("Athens"))
            return false;
        customers.add(customer);
        return true;
    }

    @Override
    public Customer readCustomer(int id) {

        for(Customer customer : customers){
            if (customer.getId() == id)
                return customer;
        }
        return null;
    }

    @Override
    public List<Customer> readCustomer() {
        List<Customer> returnCustomers = new ArrayList<>();
        for(Customer customer : customers) {
            returnCustomers.add(customer);
        }
        return returnCustomers;
    }

    @Override
    public boolean updateCustomer(int id, String newAddress) {
        Customer customer = readCustomer (id);
        if(customer == null)
            return false;
        customer.setAddress(newAddress);
        return true;
    }

    @Override
    public boolean deleteCustomer(int id) throws CustomerException {
        Customer customer = readCustomer (id);
        if(customer == null)
            throw new CustomerException();
        customers.remove(customer);
        return true;
    }
}
