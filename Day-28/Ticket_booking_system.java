import java.util.*;

public class Ticket_booking_system {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int totalSeats = 50;
        int choice;

        do {

            System.out.println("\n====== Ticket Booking System ======");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Check Available Seats");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:

                    System.out.print("Enter number of tickets: ");
                    int book = sc.nextInt();

                    if(book <= totalSeats) {

                        totalSeats = totalSeats - book;

                        System.out.println("Booking Successful!");
                        System.out.println("Remaining Seats: " + totalSeats);

                    } else {

                        System.out.println("Not enough seats available!");
                    }

                    break;

                case 2:

                    System.out.print("Enter number of tickets to cancel: ");
                    int cancel = sc.nextInt();

                    totalSeats = totalSeats + cancel;

                    if(totalSeats > 50) {
                        totalSeats = 50;
                    }

                    System.out.println("Cancellation Successful!");
                    System.out.println("Available Seats: " + totalSeats);

                    break;

                case 3:

                    System.out.println("Available Seats: " + totalSeats);
                    break;

                case 4:

                    System.out.println("Thank You for Using Ticket Booking System.");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while(choice != 4);
    }
}