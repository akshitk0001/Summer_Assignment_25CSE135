import java.util.Scanner;

public class StudentRecordSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] roll = new int[100];
        String[] name = new String[100];
        int[] marks = new int[100];

        int count = 0;
        int choice;

        do {

            System.out.println("\n===== STUDENT RECORD SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:

                    System.out.print("Enter Roll Number: ");
                    roll[count] = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    name[count] = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    marks[count] = sc.nextInt();

                    count++;

                    System.out.println("Student Record Added Successfully!");
                    break;

                case 2:

                    if(count == 0) {

                        System.out.println("No Student Records Found.");

                    } else {

                        System.out.println("\n----- Student Records -----");

                        for(int i = 0; i < count; i++) {

                            System.out.println("Roll Number : " + roll[i]);
                            System.out.println("Name        : " + name[i]);
                            System.out.println("Marks       : " + marks[i]);
                            System.out.println();
                        }
                    }

                    break;

                case 3:

                    if(count == 0) {

                        System.out.println("No Student Records Found.");

                    } else {

                        System.out.print("Enter Roll Number to Search: ");
                        int searchRoll = sc.nextInt();

                        boolean found = false;

                        for(int i = 0; i < count; i++) {

                            if(roll[i] == searchRoll) {

                                System.out.println("\nStudent Found");
                                System.out.println("Roll Number : " + roll[i]);
                                System.out.println("Name        : " + name[i]);
                                System.out.println("Marks       : " + marks[i]);

                                found = true;
                                break;
                            }
                        }

                        if(!found) {

                            System.out.println("Student Record Not Found.");
                        }
                    }

                    break;

                case 4:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while(choice != 4);

        sc.close();
    }
}