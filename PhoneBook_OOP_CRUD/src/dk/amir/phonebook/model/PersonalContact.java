package dk.amir.phonebook.model;

import java.util.List;

public class PersonalContact  extends Contact{
    private String family;
    private String email;

    public PersonalContact( String name, List<String> phoneNumber) {
        super(ContactType.PERSONAL, name, phoneNumber);
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
