package dk.myapp.phonebook.model;

public class PersonalContact extends Contact{
    private String family;

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public PersonalContact(ContactType type, String name, String number) {
        super(type, name, number);
    }
}
