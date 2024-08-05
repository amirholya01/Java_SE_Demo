package dk.customerSystem.service;

import dk.customerSystem.model.Customer;
import dk.customerSystem.model.LegalCustomer;
import dk.customerSystem.model.RealCustomer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CustomerSystem implements AutoCloseable{
    private Scanner scanner = new Scanner(System.in);
    private List<Customer> customers = new ArrayList<>();
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
                case 2:
                    printAllCustomers();
                    break;
                case 3:
                    searchAndPrintCustomersByName();
                    break;
                case 4:
                    searchAndPrintCustomersByFamily();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while (choice != 0);
    }

    private void searchAndPrintCustomersByFamily() {
        System.out.println("Please enter family name: ");
        String familyName = scanner.nextLine();

        if (!customers.isEmpty()){
            List<Customer> matchingCustomers = customers.stream()
                    .filter(customer -> customer.getLastName().equalsIgnoreCase(familyName))
                    .toList();

            if(!matchingCustomers.isEmpty()){
                matchingCustomers.forEach(System.out::println);
            }else {
                System.out.println("Customer not found");
            }

        }else
            System.out.println("No Customers found");
    }

    private void searchAndPrintCustomersByName() {
        System.out.println("Please enter your  firstname : ");
        String firstName = scanner.nextLine();

        if (!customers.isEmpty()){
            List<Customer> matchingCustomers = customers.stream()
                    .filter(customer -> customer.getFirstName().equalsIgnoreCase(firstName))
                    .toList();

            if(!matchingCustomers.isEmpty()){
                matchingCustomers.forEach(System.out::println);
            }else {
                System.out.println("Customer not found");
            }

        }else
            System.out.println("No Customers found");

//        if (!customers.isEmpty()) {
//            for (Customer customer : customers) {
//                if (customer.getFirstName().equalsIgnoreCase(firstName)) {
//                    System.out.println(customer);
//                } else
//                    System.out.println("The name was not found");
//            }
//        }else System.out.println("No customers found");
    }

    private void printAllCustomers() {
        if(!customers.isEmpty()){
            for (Customer customer : customers) {
                System.out.println(customer);
            }
        }else
            System.out.println("No customers found");
    }

    private void addNewCustomer() {
        System.out.println("Please choose one of the following options:");
        System.out.println("1 - Real Customer:");
        System.out.println("2 - Legal Customer:");
        System.out.println("Please enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        if (choice == 1) {
            String firstName = getUserInput("Please enter first name: ");
            String lastName = getUserInput("Please enter last name: ");
            String phoneNumber = getUserInput("Please enter phone number: ");
            String email = getUserInput("Please enter email: ");
            String homeAddress = getUserInput("Please enter home address: ");
            RealCustomer realCustomer = new RealCustomer(firstName, lastName, phoneNumber, email);
            realCustomer.setHomeAddress(homeAddress);
            customers.add(realCustomer);
        }else if (choice == 2) {
            String firstName = getUserInput("Please enter first name: ");
            String lastName = getUserInput("Please enter last name: ");
            String phoneNumber = getUserInput("Please enter phone number: ");
            String email = getUserInput("Please enter email: ");
            String companyName = getUserInput("Please enter company name: ");
            LegalCustomer legalCustomer = new LegalCustomer(firstName, lastName, phoneNumber, email);
            legalCustomer.setCompanyName(companyName);
            customers.add(legalCustomer);
        }else
            System.out.println("Invalid choice");

    }

    private void printMenu(){
        System.out.println("-------------------------------------------");
        System.out.println("Please choose one of the following options:");
        System.out.println("0. Exit");
        System.out.println("1. Create Customer");
        System.out.println("2. Print All Customers");
        System.out.println("3. Search And Print Customers By Name");
        System.out.println("4. Search And Print Customers By Family");
    }

    private String getUserInput(String message){
        System.out.println(message);
        return scanner.nextLine();
    }
    @Override
    public void close()  {
        scanner.close();
    }
}
