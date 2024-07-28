package dk.amir.phonebook.service;

import dk.amir.phonebook.model.BusinessContact;
import dk.amir.phonebook.model.Contact;
import dk.amir.phonebook.model.PersonalContact;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook implements AutoCloseable{
    private ArrayList<Contact> contacts = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void run(){
        int choice;
        do {
            printMenu();
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addContact(scanner);
                    break;
                case 2:
                    printAllContacts();
                    break;
                case 3:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }while (choice != 3);
        scanner.close();
    }
    private void printMenu(){
        System.out.println("---Welcome to Phone Book---");
        System.out.println("1. Add Contact");
        System.out.println("2. Print All Contacts");
        System.out.println("3. Exit\n");
    }
    private void addContact(Scanner scanner){
        System.out.println("--Contact Type:");
        System.out.println("1-Personal");
        System.out.println("2-Business");
        System.out.println("Enter your choice:");
        int choice = scanner.nextInt();
        scanner.nextLine();
        if (choice == 1){
            System.out.println("Enter Contact Name:");
            String name = scanner.nextLine();
            System.out.println("Enter Contact Family:");
            String family = scanner.nextLine();
            System.out.println("Enter Contact Phone:");
            String phone = scanner.nextLine();
            PersonalContact personalContact = new PersonalContact(name, phone);
            personalContact.setFamily(family);
            contacts.add(personalContact);
        }else {
            System.out.println("Enter Contact Name:");
            String name = scanner.nextLine();
            System.out.println("Enter Contact Phone:");
            String phone = scanner.nextLine();
            System.out.println("Enter Contact Fax:");
            String fax = scanner.nextLine();
            BusinessContact businessContact = new BusinessContact(name, phone);
            businessContact.setFax(fax);
            contacts.add(businessContact);

        }
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

    @Override
    public void close() {
        scanner.close();
    }
}
