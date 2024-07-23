package dk.amir;

import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printMenu();
        System.out.println("Enter your choice:");
        int choice = scanner.nextInt();
        System.out.println(choice);
        scanner.close();
    }
    public static void printMenu(){
        System.out.println("----Menu----");
        System.out.println("1 - Add Phone");
        System.out.println("2 - Display All Phones");
        System.out.println("3 - Exit\n");
    }
}
