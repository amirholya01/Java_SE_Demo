package dk.myapp.phonebook.model;

public class Contact {
    private String name;
    private int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = capitalizeFirstLetter(name);
    }

    public int getNumber() {
        return number;
    }


    public void setNumber(int number) {
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
                ", number=" + number +
                '}';
    }
}
