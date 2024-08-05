package dk.customerSystem.model;

import dk.customerSystem.enums.CustomerType;

public class RealCustomer extends Customer{
    private String homeAddress;
    public RealCustomer(String firstName, String lastName, String phoneNumber, String email) {
        super(firstName, lastName, phoneNumber, email, CustomerType.REAL_CUSTOMER);
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    @Override
    public String toString() {
        return "RealCustomer{" +
                super.toString() +
                ", homeAddress='" + homeAddress + '\'' +
                '}';
    }
}
