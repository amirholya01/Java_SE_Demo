package dk.myapp.phonebook.model;

public class PersonalContact extends Contact{
    private String family;

    public PersonalContact( String name, String number) {
        super( ContactType.PERSONAL,name, number);
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }


}
