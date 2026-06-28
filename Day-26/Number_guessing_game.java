import java.util.*;

public class Number_guessing_game {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Random number between 1 and 100
        int secretNumber = random.nextInt(100) + 1;

        int guess;
        int attempts = 0;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("Guess a number between 1 and 100.");

        do {

            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            attempts++;

            if(guess > secretNumber) {
                System.out.println("Too High!");
            }
            else if(guess < secretNumber) {
                System.out.println("Too Low!");
            }
            else {
                System.out.println("Congratulations!");
                System.out.println("You guessed the correct number.");
                System.out.println("Total Attempts = " + attempts);
            }

        } while(guess != secretNumber);
    }
}