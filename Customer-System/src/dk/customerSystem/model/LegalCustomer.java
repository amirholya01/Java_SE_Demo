package dk.customerSystem.model;

import dk.customerSystem.enums.CustomerType;

public class LegalCustomer extends Customer{
    public LegalCustomer(String firstName, String lastName, String phoneNumber, String email, CustomerType customerType) {
        super(firstName, lastName, phoneNumber, email, customerType);
    }
}
