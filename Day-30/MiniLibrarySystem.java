import java.util.Scanner;

public class MiniLibrarySystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] bookId = new int[100];
        String[] bookName = new String[100];
        boolean[] issued = new boolean[100];

        int count = 0;
        int choice;

        do {

            System.out.println("\n===== MINI LIBRARY SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:

                    System.out.print("Enter Book ID: ");
                    bookId[count] = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Name: ");
                    bookName[count] = sc.nextLine();

                    issued[count] = false;
                    count++;

                    System.out.println("Book Added Successfully!");
                    break;

                case 2:

                    if(count == 0) {

                        System.out.println("No Books Available.");

                    } else {

                        System.out.println("\n----- Book List -----");

                        for(int i = 0; i < count; i++) {

                            System.out.println("Book ID   : " + bookId[i]);
                            System.out.println("Book Name : " + bookName[i]);

                            if(issued[i])
                                System.out.println("Status    : Issued");
                            else
                                System.out.println("Status    : Available");

                            System.out.println();
                        }
                    }

                    break;

                case 3:

                    if(count == 0) {

                        System.out.println("No Books Available.");

                    } else {

                        System.out.print("Enter Book ID to Issue: ");
                        int issueId = sc.nextInt();

                        boolean found = false;

                        for(int i = 0; i < count; i++) {

                            if(bookId[i] == issueId) {

                                found = true;

                                if(!issued[i]) {

                                    issued[i] = true;
                                    System.out.println("Book Issued Successfully!");

                                } else {

                                    System.out.println("Book Already Issued.");
                                }

                                break;
                            }
                        }

                        if(!found)
                            System.out.println("Book Not Found.");
                    }

                    break;

                case 4:

                    if(count == 0) {

                        System.out.println("No Books Available.");

                    } else {

                        System.out.print("Enter Book ID to Return: ");
                        int returnId = sc.nextInt();

                        boolean found = false;

                        for(int i = 0; i < count; i++) {

                            if(bookId[i] == returnId) {

                                found = true;

                                if(issued[i]) {

                                    issued[i] = false;
                                    System.out.println("Book Returned Successfully!");

                                } else {

                                    System.out.println("Book is Already Available.");
                                }

                                break;
                            }
                        }

                        if(!found)
                            System.out.println("Book Not Found.");
                    }

                    break;

                case 5:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while(choice != 5);

        sc.close();
    }
}