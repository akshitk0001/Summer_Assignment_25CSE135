import java.util.*;

public class Marksheet_generation_system {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        int marks[] = new int[5];
        int total = 0;
        System.out.println("Enter Marks of 5 Subjects:");
        for(int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        double percentage = total / 5.0;
        String grade;
        if(percentage >= 90)
            grade = "A+";
        else if(percentage >= 80)
            grade = "A";
        else if(percentage >= 70)
            grade = "B";
        else if(percentage >= 60)
            grade = "C";
        else if(percentage >= 40)
            grade = "D";
        else
            grade = "F";

        boolean pass = true;

        for(int i = 0; i < 5; i++) {
            if(marks[i] < 33) {
                pass = false;
                break;
            }
        }

        System.out.println("\n========== MARKSHEET ==========");
        System.out.println("Roll Number : " + roll);
        System.out.println("Name        : " + name);

        System.out.println();

        for(int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + " : " + marks[i]);
        }

        System.out.println("\nTotal Marks : " + total);
        System.out.println("Percentage  : " + percentage + "%");
        System.out.println("Grade       : " + grade);

        if(pass)
            System.out.println("Result      : PASS");
        else
            System.out.println("Result      : FAIL");
    }
}