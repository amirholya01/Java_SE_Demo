package dk.customerSystem.service;

import java.util.Scanner;

public class CustomerSystem implements AutoCloseable{
    Scanner scanner = new Scanner(System.in);
    public void run(){
        int choice;
        do {
            printMenu();
            System.out.println("Please enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("Exit Application !!!!");
                    break;
                case 1:
                    addNewCustomer();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while (choice != 0);
    }

    private void addNewCustomer() {
        System.out.println("Please choose one of the following options:");
        System.out.println("1 - Real Customer:");
        System.out.println("2 - Legal Customer:");
        System.out.println("Please enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        if (choice == 1) {
            System.out.println("Real Customer");
        }else if (choice == 2) {
            System.out.println("Legal Customer");
        }else
            System.out.println("Invalid choice");

    }

    private void printMenu(){
        System.out.println("-------------------------------------------");
        System.out.println("Please choose one of the following options:");
        System.out.println("0. Exit");
        System.out.println("1. Create Customer");
    }
    @Override
    public void close()  {
        scanner.close();
    }
}
