package dk.myapp.phonebook.model;

public class Contact {
    private String name;
    private String number;
    private final ContactType type;

    public Contact(ContactType type, String name, String number) {
        this.type = type;
        this.name = name;
        this.number = number;
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

    public String getNumber() {
        return number;
    }


    public void setNumber(String number) {
        this.number = number;
    }

    private String capitalizeFirstLetter(String str){
        if(str != null && !str.isEmpty()){
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        return  str;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", type=" + type +
                '}';
    }
}
