package dk.myapp.phonebook;

import dk.myapp.phonebook.service.PhoneBook;

public class ApplicationRunner {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.run();
    }
}
