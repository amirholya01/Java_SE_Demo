package dk.amir.phonebook.model;

import dk.amir.phonebook.enums.ContactType;

public class BusinessContact extends Contact{
    private String fax;
    public BusinessContact(String name, String phoneNumber) {
        super(name, phoneNumber, ContactType.BUSINESS);
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
}
