package dk.myapp.phonebook.model;

public class BusinessContact extends Contact{
    private String fax;

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public BusinessContact(ContactType type, String name, String number) {
        super(type, name, number);
    }
}
