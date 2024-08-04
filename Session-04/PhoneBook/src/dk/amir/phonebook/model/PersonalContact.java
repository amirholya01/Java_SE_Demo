package dk.amir.phonebook.model;

import dk.amir.phonebook.enums.ContactType;

public class PersonalContact extends Contact{
    private String family;
    public PersonalContact(String name, String phoneNumber) {
        super(name, phoneNumber, ContactType.PERSONAL);
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "PersonalContact{" +
                super.toString() +
                ", family='" + family + '\'' +
                '}';
    }
}
