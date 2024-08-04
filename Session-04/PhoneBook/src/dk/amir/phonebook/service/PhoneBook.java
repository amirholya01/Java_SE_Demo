package dk.amir.phonebook.service;

import dk.amir.phonebook.model.BusinessContact;
import dk.amir.phonebook.model.Contact;
import dk.amir.phonebook.model.PersonalContact;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook implements AutoCloseable{
    ArrayList<Contact> contacts = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void run(){
        int choice;
        do {
            printMenu();
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    printAllContacts();
                    break;
                case 3:
                    searchAndPrintContactsByName();
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }while (choice != 0);
        scanner.close();
    }



    private void printMenu(){
        System.out.println("---Welcome to Phone Book---");
        System.out.println("0. Exit");
        System.out.println("1. Add Contact");
        System.out.println("2. Print All Contacts");
        System.out.println("3. Search Contacts by Name");
        System.out.println();
    }
    private void addContact(){
        System.out.println("--Contact Type:");
        System.out.println("1-Personal");
        System.out.println("2-Business");
        System.out.println("Enter your choice:");
        int choice = scanner.nextInt();
        scanner.nextLine();
        if (choice == 1){
            String name = getUserInput("Enter Contact Name:");
            String family = getUserInput("Enter Contact Family:");
            String phone = getUserInput("Enter Contact Phone:");
            PersonalContact personalContact = new PersonalContact(name, phone);
            personalContact.setFamily(family);
            contacts.add(personalContact);
        }else {
            String name = getUserInput("Enter Contact Name:");
            String phone = getUserInput("Enter Contact Phone:");
            String fax = getUserInput("Enter Contact Fax:");
            BusinessContact businessContact = new BusinessContact(name, phone);
            businessContact.setFax(fax);
            contacts.add(businessContact);

        }
    }

    private String getUserInput(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }

    private void printAllContacts(){
        if(contacts.isEmpty()){
            System.out.println("No contacts found");
        }else {
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }
    private void searchAndPrintContactsByName() {
        String name = getUserInput("Enter your name: ");
        scanner.nextLine();
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println(contact);
            }
        }
    }
 
    @Override
    public void close() {
        scanner.close();
    }
}
