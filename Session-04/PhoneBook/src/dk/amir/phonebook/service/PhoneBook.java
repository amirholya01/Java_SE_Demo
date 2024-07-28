package dk.amir.phonebook.service;

import java.util.Scanner;

public class PhoneBook {

    public void run(){
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            printMenu();
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Add");
                    break;
                case 2:
                    System.out.println("Show all");
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
    private void printMenu(){
        System.out.println("---Welcome to Phone Book---");
        System.out.println("1. Add Contact");
        System.out.println("2. Print All Contacts");
        System.out.println("3. Exit\n");
    }
}
