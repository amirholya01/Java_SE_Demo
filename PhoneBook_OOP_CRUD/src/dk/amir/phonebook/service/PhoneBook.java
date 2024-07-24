package dk.amir.phonebook.service;

public class PhoneBook {
    public void run(){
        printMenu();
    }

    private void printMenu(){
        String RESET = "\u001B[0m";
        String YELLOW = "\u001B[33m";
        System.out.println(YELLOW + "\n---Welcome to Phone Book---" + RESET) ;
        System.out.println("1. Add Contact");
        System.out.println("2. Print All Contacts");
        System.out.println("3. Delete Contact");
        System.out.println("4. Edit Contact");
        System.out.println("5. Search Contact");
        System.out.println("6. Exit\n");
    }
}
