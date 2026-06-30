import java.util.*;

public class Library_management_system {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int bookId = 0;
        String bookName = "";
        boolean isBookAdded = false;
        boolean isIssued = false;

        int choice;

        do {

            System.out.println("\n====== Library Management System ======");
            System.out.println("1. Add Book");
            System.out.println("2. Display Book");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {

                case 1:

                    System.out.print("Enter Book ID: ");
                    bookId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Name: ");
                    bookName = sc.nextLine();

                    isBookAdded = true;
                    isIssued = false;

                    System.out.println("Book Added Successfully!");
                    break;

                case 2:

                    if(isBookAdded) {

                        System.out.println("\nBook Details");
                        System.out.println("Book ID   : " + bookId);
                        System.out.println("Book Name : " + bookName);

                        if(isIssued)
                            System.out.println("Status    : Issued");
                        else
                            System.out.println("Status    : Available");

                    } else {
                        System.out.println("No Book Available.");
                    }

                    break;

                case 3:

                    if(!isBookAdded) {
                        System.out.println("No Book Found.");
                    }
                    else if(isIssued) {
                        System.out.println("Book is Already Issued.");
                    }
                    else {
                        isIssued = true;
                        System.out.println("Book Issued Successfully!");
                    }

                    break;

                case 4:

                    if(!isBookAdded) {
                        System.out.println("No Book Found.");
                    }
                    else if(!isIssued) {
                        System.out.println("Book is Already Available.");
                    }
                    else {
                        isIssued = false;
                        System.out.println("Book Returned Successfully!");
                    }

                    break;

                case 5:

                    System.out.println("Thank You for Using Library Management System.");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while(choice != 5);
    }
}