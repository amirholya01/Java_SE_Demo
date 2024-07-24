package dk.amir.phonebook.service;

import dk.amir.phonebook.model.Contact;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
    private ArrayList<Contact> contacts = new ArrayList<>();
    public void run(){
       Scanner scanner = new Scanner(System.in);
       int choice ;
       boolean flag = true;
       while (flag){
           printMenu();
           String BLUE = "\u001B[34m";
           String RESET = "\u001B[0m";
           System.out.println(BLUE + "Enter your choice:" + RESET);
           choice = scanner.nextInt();
           switch (choice){
               case 1:
                   System.out.println("add contact");
                   break;
               case 2:
                   printAllContacts();
                   break;
               case 3:
                   System.out.println("edit contact");
                   break;
               case 4:
                   System.out.println("delete contact");
                   break;
               case 5:
                   System.out.println("search contact");
                   break;
               case 6:
                   flag = false;
                   break;
               default:
                   System.out.println("Invalid choice");
                   break;
           }
       }
       scanner.close();
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

    private void printAllContacts(){
        if (contacts.isEmpty())
            System.out.println("No contacts found");
        else{
            for (Contact contact : contacts){
                System.out.println(contact);
            }
        }

    }

}
