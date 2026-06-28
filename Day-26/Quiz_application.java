import java.util.*;

public class Quiz_application {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        int answer;
        System.out.println("===== Java Quiz =====");
        System.out.println("\nQ1. Which keyword is used to create an object?");
        System.out.println("1. class");
        System.out.println("2. new");
        System.out.println("3. this");
        System.out.println("4. static");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();
        if(answer == 2) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong!");
        }
        System.out.println("\nQ2. Which loop executes at least once?");
        System.out.println("1. for");
        System.out.println("2. while");
        System.out.println("3. do-while");
        System.out.println("4. foreach");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();
        if(answer == 3) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong!");
        }
        System.out.println("\nQ3. What is the size of int data type?");
        System.out.println("1. 2 Bytes");
        System.out.println("2. 4 Bytes");
        System.out.println("3. 8 Bytes");
        System.out.println("4. 16 Bytes");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();
        if(answer == 2) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong!");
        }
        System.out.println("\n===== Quiz Finished =====");
        System.out.println("Your Score = " + score + "/3");
    }
}