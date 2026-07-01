import java.util.Scanner;

public class StudentManagementSystem {

    static Scanner sc = new Scanner(System.in);

    static int[] roll = new int[100];
    static String[] name = new String[100];
    static int[] marks = new int[100];

    static int count = 0;

    // Add Student
    static void addStudent() {

        System.out.print("Enter Roll Number: ");
        roll[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        name[count] = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks[count] = sc.nextInt();

        count++;

        System.out.println("Student Added Successfully!");
    }

    // Display Students
    static void displayStudents() {

        if(count == 0) {
            System.out.println("No Student Records Found.");
            return;
        }

        System.out.println("\n----- Student Records -----");

        for(int i = 0; i < count; i++) {

            System.out.println("Roll Number : " + roll[i]);
            System.out.println("Name        : " + name[i]);
            System.out.println("Marks       : " + marks[i]);
            System.out.println();
        }
    }

    // Search Student
    static void searchStudent() {

        if(count == 0) {
            System.out.println("No Student Records Found.");
            return;
        }

        System.out.print("Enter Roll Number: ");
        int search = sc.nextInt();

        for(int i = 0; i < count; i++) {

            if(roll[i] == search) {

                System.out.println("\nStudent Found");
                System.out.println("Roll Number : " + roll[i]);
                System.out.println("Name        : " + name[i]);
                System.out.println("Marks       : " + marks[i]);
                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    // Update Marks
    static void updateMarks() {

        if(count == 0) {
            System.out.println("No Student Records Found.");
            return;
        }

        System.out.print("Enter Roll Number: ");
        int search = sc.nextInt();

        for(int i = 0; i < count; i++) {

            if(roll[i] == search) {

                System.out.print("Enter New Marks: ");
                marks[i] = sc.nextInt();

                System.out.println("Marks Updated Successfully!");
                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    // Delete Student
    static void deleteStudent() {

        if(count == 0) {
            System.out.println("No Student Records Found.");
            return;
        }

        System.out.print("Enter Roll Number: ");
        int search = sc.nextInt();

        for(int i = 0; i < count; i++) {

            if(roll[i] == search) {

                for(int j = i; j < count - 1; j++) {

                    roll[j] = roll[j + 1];
                    name[j] = name[j + 1];
                    marks[j] = marks[j + 1];
                }

                count--;

                System.out.println("Student Deleted Successfully!");
                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateMarks();
                    break;

                case 5:
                    deleteStudent();
                    break;

                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while(choice != 6);

        sc.close();
    }
}