import java.util.*;

public class Student_record_management {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Marks in Subject 1: ");
        int m1 = sc.nextInt();
        System.out.print("Enter Marks in Subject 2: ");
        int m2 = sc.nextInt();
        System.out.print("Enter Marks in Subject 3: ");
        int m3 = sc.nextInt();
        int total = m1 + m2 + m3;
        double percentage = total / 3.0;
            char grade;

        if(percentage >= 90)
            grade = 'A';
        else if(percentage >= 75)
            grade = 'B';
        else if(percentage >= 60)
            grade = 'C';
        else if(percentage >= 40)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("\n===== Student Record =====");
        System.out.println("Roll Number : " + roll);
        System.out.println("Name        : " + name);
        System.out.println("Total Marks : " + total);
        System.out.println("Percentage  : " + percentage + "%");
        System.out.println("Grade       : " + grade);
    }
}