package dk.amir;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
    private static ArrayList<String> names = new ArrayList<>();
    private static ArrayList<String> numbers = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        //System.out.println(choice);
        do {
            printMenu();
            System.out.println("Enter your choice:");
             choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addContact(scanner);
                    break;
                case 2:
                    displayAll();
                    break;
                case 3:
                    System.out.println("Exit!");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }while (choice != 3);
        scanner.close();
    }

    private static void printMenu(){
        System.out.println("----Menu----");
        System.out.println("1 - Add Phone");
        System.out.println("2 - Display All Phones");
        System.out.println("3 - Exit\n");
    }

    private static void addContact(Scanner scanner){
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scanner.next();
        System.out.println("Enter number:");
        String number = scanner.next();
        names.add(name);
        numbers.add(number);
        //scanner.close();
    }

    private static void displayAll(){
        if(names.isEmpty() || numbers.isEmpty()){
            System.out.println("No names or numbers");
        }else {
            for (int i = 0; i < names.size(); i++) {
                System.out.println(i+1 + " - " + names.get(i) + " - " + numbers.get(i));
            }
        }
    }
}
