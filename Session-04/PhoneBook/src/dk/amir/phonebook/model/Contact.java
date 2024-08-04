package dk.amir.phonebook.model;

import dk.amir.phonebook.enums.ContactType;

public abstract class Contact {
    private String name;
    private String phoneNumber;
    private ContactType type;

    public Contact(String name, String phoneNumber, ContactType type) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.type = type;
    }

    private String capitalizeFirstLetter(String str){
        if(str != null && !str.isEmpty()){
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        return str;
    }

    public ContactType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = capitalizeFirstLetter(name);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", type=" + type +
                '}';
    }
}
