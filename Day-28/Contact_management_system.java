import java.util.*;

public class Contact_management_system {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String name = "";
        String phone = "";
        boolean contactExists = false;

        int choice;

        do {

            System.out.println("\n====== Contact Management System ======");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contact");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {

                case 1:

                    System.out.print("Enter Name: ");
                    name = sc.nextLine();

                    System.out.print("Enter Phone Number: ");
                    phone = sc.nextLine();

                    contactExists = true;

                    System.out.println("Contact Added Successfully!");
                    break;

                case 2:

                    if(contactExists) {
                        System.out.println("\nContact Details");
                        System.out.println("Name  : " + name);
                        System.out.println("Phone : " + phone);
                    } else {
                        System.out.println("No Contact Found.");
                    }

                    break;

                case 3:

                    if(contactExists) {

                        System.out.print("Enter New Name: ");
                        name = sc.nextLine();

                        System.out.print("Enter New Phone Number: ");
                        phone = sc.nextLine();

                        System.out.println("Contact Updated Successfully!");

                    } else {

                        System.out.println("No Contact Found.");
                    }

                    break;

                case 4:

                    if(contactExists) {

                        name = "";
                        phone = "";
                        contactExists = false;

                        System.out.println("Contact Deleted Successfully!");

                    } else {

                        System.out.println("No Contact Found.");
                    }

                    break;

                case 5:

                    System.out.println("Thank You for Using Contact Management System.");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while(choice != 5);
    }
}