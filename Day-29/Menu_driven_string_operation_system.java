import java.util.*;

public class Menu_driven_string_operation_system {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String str = "";
        int choice;

        do {

            System.out.println("\n====== String Operations ======");
            System.out.println("1. Input String");
            System.out.println("2. Display String");
            System.out.println("3. Find Length");
            System.out.println("4. Convert to Uppercase");
            System.out.println("5. Reverse String");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch(choice) {

                case 1:

                    System.out.print("Enter String: ");
                    str = sc.nextLine();

                    System.out.println("String Stored Successfully!");
                    break;

                case 2:

                    if(str.equals("")) {
                        System.out.println("No String Available.");
                    } else {
                        System.out.println("String = " + str);
                    }

                    break;

                case 3:

                    if(str.equals("")) {
                        System.out.println("No String Available.");
                    } else {
                        System.out.println("Length = " + str.length());
                    }

                    break;

                case 4:

                    if(str.equals("")) {
                        System.out.println("No String Available.");
                    } else {
                        System.out.println("Uppercase = " + str.toUpperCase());
                    }

                    break;

                case 5:

                    if(str.equals("")) {
                        System.out.println("No String Available.");
                    } else {

                        String reverse = "";

                        for(int i = str.length() - 1; i >= 0; i--) {
                            reverse += str.charAt(i);
                        }

                        System.out.println("Reverse = " + reverse);
                    }

                    break;

                case 6:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while(choice != 6);
    }
}