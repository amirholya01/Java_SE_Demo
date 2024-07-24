package dk.amir.phonebook.model;

import java.util.List;

public class BusinessContact extends Contact{
    private String fax;
    private String companyName;

    public BusinessContact( String name, List<String> phoneNumber) {
        super(ContactType.BUSINESS, name, phoneNumber);
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
