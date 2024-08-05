package dk.customerSystem.service;

import java.util.Scanner;

public class CustomerSystem implements AutoCloseable{
    Scanner scanner = new Scanner(System.in);
    public void run(){
        printMenu();
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
