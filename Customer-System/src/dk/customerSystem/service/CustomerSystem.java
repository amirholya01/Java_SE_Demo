package dk.customerSystem.service;

import java.util.Scanner;

public class CustomerSystem implements AutoCloseable{
    Scanner scanner = new Scanner(System.in);
    public void run(){
        System.out.println("Welcome to Customer System");
    }
    @Override
    public void close()  {
        scanner.close();
    }
}
