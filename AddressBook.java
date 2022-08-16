package Review2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

    Scanner scan = new Scanner(System.in);
    private List<contacts> contactList = new ArrayList<>();

    public void addContact(contacts contacts) {
        contactList.add(contacts);
    }

    public void addNewContact() {
        System.out.println("Enter the details to Add :");
        System.out.println("Enter Name");
        String name = scan.nextLine();
        System.out.println("Enter Age");
        int age = scan.nextInt();
        System.out.println("Enter Phone Number");
        long phoneNo = scan.nextLong();
        System.out.println("Enter City");
        String city = scan.nextLine();
        System.out.println("Enter State");
        String state = scan.nextLine();
    }
}