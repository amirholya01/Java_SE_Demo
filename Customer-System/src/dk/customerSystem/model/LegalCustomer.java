package dk.customerSystem.model;

import dk.customerSystem.enums.CustomerType;

public class LegalCustomer extends Customer{
    private String companyName;
    public LegalCustomer(String firstName, String lastName, String phoneNumber, String email) {
        super(firstName, lastName, phoneNumber, email, CustomerType.LEGAL_CUSTOMER);
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "LegalCustomer{" +
                super.toString() +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
