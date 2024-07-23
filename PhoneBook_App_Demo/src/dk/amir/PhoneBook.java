package dk.amir;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();
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
                    System.out.println("Enter contact name: ");
                    String name = scanner.next();
                    System.out.println("Enter contact number: ");
                    String number = scanner.next();
                    names.add(name);
                    numbers.add(number);
                    System.out.println("Contact added successfully");
                    break;
                case 2:
                     if (names.isEmpty() || numbers.isEmpty()) {
                         System.out.println("You have not entered any contacts!");
                     }else {
                         for (int i = 0; i < names.size(); i++) {
                             System.out.println(i+1 + " .  " + names.get(i) + " " + numbers.get(i));
                         }
                     }
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
