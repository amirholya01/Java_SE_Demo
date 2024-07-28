package dk.amir.phonebook;

import dk.amir.phonebook.service.PhoneBook;

public class ApplicationRunner {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.run();
    }
}
