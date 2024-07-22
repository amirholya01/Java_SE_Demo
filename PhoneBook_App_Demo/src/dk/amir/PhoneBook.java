package dk.amir;

import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice ;
        do {
            System.out.println("---Menu---");
            System.out.println("1. Add contact");
            System.out.println("2. Print all contacts");
            System.out.println("3. Exit\n");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Add contact");
                    break;
                case 2:
                    System.out.println("Print all contacts");
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }while (choice != 3);
        scanner.close();
    }
}
