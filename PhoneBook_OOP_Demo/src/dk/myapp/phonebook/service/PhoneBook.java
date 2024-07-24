package dk.myapp.phonebook.service;

import dk.myapp.phonebook.model.Contact;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            menu();
            System.out.println("Please enter your choice");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Add");
                    break;
                case 2:
                    System.out.println("Print");
                    break;
                case 3:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }while (choice != 3);
    }
    public static void menu(){
        System.out.println("---Welcome to Phone Book---");
        System.out.println("1. Add Contact");
        System.out.println("2. Print All Contacts");
        System.out.println("3. Exit\n");
    }
}
