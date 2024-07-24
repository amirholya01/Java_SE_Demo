package dk.amir.phonebook.model;

import java.util.List;

public abstract class Contact {
    private String name;
    private List<String> phoneNumber;
    private final ContactType type;


    public Contact(ContactType type, String name, List<String> phoneNumber) {
        this.type = type;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(List<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ContactType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", type=" + type +
                '}';
    }
}
