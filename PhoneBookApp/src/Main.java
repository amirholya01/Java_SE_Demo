import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      List<Contact> contacts = new ArrayList<>();
      String RESET = "\u001B[0m";
      String RED = "\u001B[31m";
      boolean flag = true;
      while (flag){
          System.out.println("-----Menu-----");
          System.out.println(RED + "Please enter just numeric !!" + RESET);
          System.out.println("1. Add Contact");
          System.out.println("2. Show Contact");
          System.out.println("3. Exit");
          System.out.println("------------------");
          System.out.println("Enter your choice: ");
          switch (scanner.nextInt()){
              case 1:
                  System.out.println("Please enter the name of the contact: ");
                  String name = scanner.next();
                  System.out.println("Please enter the phone number: ");
                  String phone = scanner.next();
                  contacts.add(new Contact(name, phone));
                  break;
                  case 2:
                      if (contacts.isEmpty()) {
                          System.out.println("No contacts found.");
                      } else {
                          for (Contact contact : contacts) {
                              System.out.println(contact);
                          }
                      }
                      break;
                      case 3:
                          flag = false;
                          break;
              default:
                  System.out.println("Invalid choice");
                  break;
          }
      }
      scanner.close();
    }
}
