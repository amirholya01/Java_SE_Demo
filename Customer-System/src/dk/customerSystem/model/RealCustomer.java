package dk.customerSystem.model;

import dk.customerSystem.enums.CustomerType;

public class RealCustomer extends Customer{
    public RealCustomer(String firstName, String lastName, String phoneNumber, String email, CustomerType customerType) {
        super(firstName, lastName, phoneNumber, email, customerType);
    }
}
